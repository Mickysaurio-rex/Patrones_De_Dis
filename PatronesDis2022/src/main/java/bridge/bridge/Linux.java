package bridge.bridge;

public class Linux implements IPlataforma{
    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arqui() {
        System.out.println("Sistema: Linux");
        arquitectura.arqui();
    }
}
