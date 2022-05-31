package examenPrimerParcialB.ejercicio4;

public class ContratoAMAZON extends BuilderContrato{
    @Override
    public void buildCosto(){
        this.contrato.setCosto(50);
    }
    @Override
    public void buildEmpresa(){
        this.contrato.setEmpresa("Aws");
    }
    @Override
    public void buildListaDeCanales(){
        this.contrato.setListaDeCanales("The boys, Venom, Invencible");
    }
}
