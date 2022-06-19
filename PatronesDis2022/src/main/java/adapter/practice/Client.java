package adapter.practice;

public class Client {
    public static void main(String []args){
        ISmart celular = new Celular(120, 4);
        ISmart tablet = new Tablet(500, 3);
        ISmart computadora = new Computadora(1000, 4);
        ISmart refrigerador = new RefrigeradorA(new Refrigerador(600, 2));
        ISmart lavadora = new LavadoraA(new Lavadora(200, 2));
        ISmart televisor = new TelevisorA(new Televisor(2000, 1));

        celular.precio();
        celular.tiempoDeVida();

        tablet.precio();
        tablet.tiempoDeVida();

        computadora.precio();
        computadora.tiempoDeVida();

        refrigerador.precio();
        refrigerador.tiempoDeVida();

        lavadora.precio();
        lavadora.tiempoDeVida();

        televisor.precio();
        televisor.tiempoDeVida();

    }
}
