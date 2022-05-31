package examenPrimerParcialB.ejercicio4;

public class ContratoHBO extends BuilderContrato{
    @Override
    public void buildCosto(){
        this.contrato.setCosto(100);
    }
    @Override
    public void buildEmpresa(){
        this.contrato.setEmpresa("HBO");
    }
    @Override
    public void buildListaDeCanales(){
        this.contrato.setListaDeCanales("Spider Man, Big Bang Theory, Game of Trones");
    }
}
