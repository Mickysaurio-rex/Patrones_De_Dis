package Iterator.practica;

import java.util.Stack;

public class IteratorImpor4 implements Iterator{
    private int position;
    private Stack<Auto> listaAutos;

    public IteratorImpor4( Stack<Auto> listaAutos){
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
