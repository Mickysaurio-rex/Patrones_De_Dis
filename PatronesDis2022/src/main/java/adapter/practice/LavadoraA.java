package adapter.practice;

public class LavadoraA implements ISmart{
    private Lavadora lavadora;

    public LavadoraA(Lavadora lavadora) {
        this.lavadora = lavadora;
    }


    @Override
    public void precio() {
        lavadora.costo();
    }

    @Override
    public void tiempoDeVida() {
        lavadora.tiempoDeGarantia();
    }
}
