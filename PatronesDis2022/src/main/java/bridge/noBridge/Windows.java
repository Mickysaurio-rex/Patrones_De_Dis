package bridge.noBridge;

public class Windows implements IPlataforma{

    @Override
    public void crearSistema() {
        System.out.println("Iniciando el Sitema Windows");
    }

    @Override
    public void arqui86() {
        System.out.println("x86");
    }

    @Override
    public void arqui64() {
        System.out.println("64");
    }
}
