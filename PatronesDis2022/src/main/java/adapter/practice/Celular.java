package adapter.practice;

public class Celular implements ISmart {

    double precioC;
    int tiempoVida;

    public Celular(double precioC, int tiempoVida) {
        this.precioC = precioC;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void precio() {
        System.out.println("El precio del celular es de: " + precioC);
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("Tiene " + tiempoVida + " años\n\n\n");
    }
}
