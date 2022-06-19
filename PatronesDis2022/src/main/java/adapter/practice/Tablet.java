package adapter.practice;

public class Tablet implements ISmart {

    double precioC;
    int tiempoVida;

    public Tablet(double precioC, int tiempoVida) {
        this.precioC = precioC;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void precio() {
        System.out.println("El precio de la tablet es de: " + precioC);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Tiene " + tiempoVida + " años \n\n\n");
    }
}
