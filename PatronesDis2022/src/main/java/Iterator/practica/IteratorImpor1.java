package Iterator.practica;

public class IteratorImpor1 implements Iterator{
    private int position;
    private Auto[] listaAutos;

    public IteratorImpor1(Auto[] listaAutos){
        this.listaAutos =listaAutos;
    }

    @Override
    public Object next() {
        return listaAutos[position++];
    }

    @Override
    public boolean hasNext() {
        return listaAutos.length != 0 && position < listaAutos.length;
    }
}
