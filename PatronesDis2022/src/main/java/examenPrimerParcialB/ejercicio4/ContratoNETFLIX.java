package examenPrimerParcialB.ejercicio4;

public class ContratoNETFLIX extends BuilderContrato{
    @Override
    public void buildCosto(){
        this.contrato.setCosto(150);
    }
    @Override
    public void buildEmpresa(){
        this.contrato.setEmpresa("Netflix");
    }
    @Override
    public void buildListaDeCanales(){
        this.contrato.setListaDeCanales("La casa de Papel, Vis a Vis, Stranger Things");
    }
}
