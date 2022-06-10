package strategy.practice;

public class Client {
    public static void main(String[]args){
        TiendaRopa tiendaRopa = new TiendaRopa("GAP");
        tiendaRopa.addRopa(new Ropa("Canguro", 98));
        tiendaRopa.addRopa(new Ropa("Chamarra", 56));
        tiendaRopa.addRopa(new Ropa("Pantalon", 100));
        tiendaRopa.addRopa(new Ropa("Polera", 20));

        tiendaRopa.setEstacion(new Invierno());
        tiendaRopa.cambiarTemporada();
    }
}
