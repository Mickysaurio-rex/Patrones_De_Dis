package Iterator.practica;

import java.util.Vector;

public class Impor3 implements IAggregate{
    private Vector<Auto> listaAutos;

    public Impor3(){
        listaAutos = new Vector<Auto>();
    }

    public void add (Auto value){
        listaAutos.add(value);
    }

    @Override
    public IteratorImpor3 createIterator() {
        return new IteratorImpor3(listaAutos);
    }
}
