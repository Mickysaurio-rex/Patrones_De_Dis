package composite;

public class Computadora extends Componente{
    public Computadora(String type){
        super(type);
    }

    @Override
    public void mostrarDetalles() {
        this.showInfo();
    }

    @Override
    public void add(Componente component) {
        //TODO
    }

    @Override
    public void remove(Componente component) {
        //TODO
    }
}
