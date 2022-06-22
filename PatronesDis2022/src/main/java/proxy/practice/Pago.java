package proxy.practice;

public class Pago {
    private String detalles;
    private String tipoDeMoneda;
    private int monto;

    public Pago(String detalles, String tipoDeMoneda, int monto) {
        this.detalles = detalles;
        this.tipoDeMoneda = tipoDeMoneda;
        this.monto = monto;
    }

    public String getDetalles() {
        return detalles;
    }

    public String getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void showInfo(){
        System.out.println("El pago por " + detalles + " es de:" + monto + " " +tipoDeMoneda);

    }
}
