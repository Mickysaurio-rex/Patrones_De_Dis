package Iterator.practica;

public class Impor1 implements IAggregate{
    private int position;
    private Auto [] listaAutos;

    public Impor1(){
        listaAutos = new Auto[1];
    }

    public void add (Auto value){
        listaAutos[position]=value;
        position++;
    }

    @Override
    public IteratorImpor1 createIterator() {
        return new IteratorImpor1(listaAutos);
    }
}
