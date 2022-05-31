package examenPrimerParcialB.ejercicio4;


public class Proveedor {
    private BuilderContrato builder;

    public Contrato getContratoRealizado(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderContrato builder) {
        this.builder = builder;
    }

    public void realizarContrato(){
        this.builder.createContrato();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaDeCanales();
    }
}
