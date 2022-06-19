package adapter.practice;

public class Lavadora implements IElectrodomesticos{

    double costo;
    int tiempoGarantia;

    public Lavadora(double costo, int tiempoGarantia) {
        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo de la lavadora es: " + costo);
    }

    @Override
    public void tiempoDeGarantia() {
        System.out.println("El tiempo de garantia es: " + tiempoGarantia + " años\n\n\n");
    }
}
