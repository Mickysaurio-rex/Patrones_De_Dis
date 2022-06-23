package bridge.practice;

public class EmpresaSA implements IEmpresa {
    private IMedio medio;

    public void setMedio(IMedio medio) {
        this.medio = medio;
    }


    @Override
    public void enviar(Paquete paquete) {
        medio.enviar(paquete);
    }
}
