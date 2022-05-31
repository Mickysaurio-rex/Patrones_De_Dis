package Iterator.practica;

import java.util.List;

public class IteratorImpor2 implements Iterator{
    private int position;
    private List<Auto> listaAutos;

    public IteratorImpor2( List<Auto> listaAutos){
        this.listaAutos=listaAutos;
        position = 0;
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
