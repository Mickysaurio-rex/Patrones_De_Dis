package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCompu extends Componente{
    private List<Componente> componentList = new ArrayList<>();
    int precioTotal = 0;

    public CompositeCompu(String tipo){
        super(tipo);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("- Composite > " + getTipo());
        for(Componente c : componentList){
            c.mostrarDetalles();
            precioTotal = precioTotal+c.getPrecio();
        }
        //System.out.println(precioTotal);
        if(this.getTipo().startsWith("Laboratorio")){
            this.setPrecio(precioTotal);
            System.out.println("Precio del laboratorio " + precioTotal + " $");
        } else if(this.getTipo().startsWith("Contenedor")){
            this.setPrecio(precioTotal);
            System.out.println("Precio del contenedor > " + precioTotal + " $");
        }

    }

    @Override
    public void add(Componente component) {
        componentList.add(component);
    }

    @Override
    public void remove(Componente component) {
        componentList.remove(component);
    }
}
