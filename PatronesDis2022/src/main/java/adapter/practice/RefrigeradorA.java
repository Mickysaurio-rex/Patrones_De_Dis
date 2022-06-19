package adapter.practice;

public class RefrigeradorA implements ISmart{
    private Refrigerador refrigerador;

    public RefrigeradorA(Refrigerador refrigerador) {
        this.refrigerador = refrigerador;
    }


    @Override
    public void precio() {
        refrigerador.costo();
    }

    @Override
    public void tiempoDeVida() {
        refrigerador.tiempoDeGarantia();
    }
}
