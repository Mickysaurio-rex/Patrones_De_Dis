package Iterator.practica;

import java.util.Stack;

public class Impor4 implements IAggregate{
    private Stack<Auto> listaAutos;

    public Impor4(){
        listaAutos = new Stack<Auto>();
    }

    public void add (Auto value){
        listaAutos.add(value);
    }

    @Override
    public IteratorImpor4 createIterator() {
        return new IteratorImpor4(listaAutos);
    }
}
