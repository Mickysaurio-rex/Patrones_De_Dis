package adapter.practice;

public class TelevisorA implements ISmart{
    private Televisor televisor;

    public TelevisorA(Televisor televisor) {
        this.televisor = televisor;
    }


    @Override
    public void precio() {
        televisor.costo();
    }

    @Override
    public void tiempoDeVida() {
        televisor.tiempoDeGarantia();
    }
}
