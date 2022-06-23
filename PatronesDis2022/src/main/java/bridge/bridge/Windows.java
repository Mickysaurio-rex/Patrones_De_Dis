package bridge.bridge;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arqui() {
        System.out.println("Sistema: Windows");
        arquitectura.arqui();
    }
}
