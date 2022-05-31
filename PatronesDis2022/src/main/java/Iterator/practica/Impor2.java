package Iterator.practica;

import java.util.ArrayList;
import java.util.List;

public class Impor2 implements IAggregate{
    private List<Auto> listaAutos;

    public Impor2(){
        listaAutos = new ArrayList<Auto>();
    }

    public void add (Auto value){
        listaAutos.add(value);
    }

    @Override
    public IteratorImpor2 createIterator() {
        return new IteratorImpor2(listaAutos);
    }
}
