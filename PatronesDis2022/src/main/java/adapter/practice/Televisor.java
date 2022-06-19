package adapter.practice;

public class Televisor implements IElectrodomesticos{
    double costo;
    int tiempoGarantia;

    public Televisor(double costo, int tiempoGarantia) {
        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo del televisor es: " + costo);
    }

    @Override
    public void tiempoDeGarantia() {
        System.out.println("El tiempo de garantia es: " + tiempoGarantia + " años\n\n\n");
    }
}
