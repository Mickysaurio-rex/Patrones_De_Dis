package examenPrimerParcialB.ejercicio4;


public abstract class BuilderContrato {

    protected Contrato contrato;

    public Contrato getProduct(){
        return contrato;
    }

    public void createContrato(){
        this.contrato = new Contrato();
    }

    public abstract void buildCosto();

    public abstract void buildEmpresa();

    public abstract void buildListaDeCanales();
}
