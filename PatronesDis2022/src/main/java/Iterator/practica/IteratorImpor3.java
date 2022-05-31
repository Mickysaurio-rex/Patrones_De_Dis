package Iterator.practica;

import java.util.Vector;

public class IteratorImpor3 implements Iterator{
    private int position;
    private Vector<Auto> listaAutos;

    public IteratorImpor3( Vector<Auto> listaAutos){
        this.listaAutos =listaAutos;
    }

    @Override
    public Object next() {
        return listaAutos.get(position++);
    }

    @Override
    public boolean hasNext() {
        return listaAutos.size() != 0 && position < listaAutos.size();
    }
}
