package examenPrimerParcialB.ejercicio4;

public class Contrato {
    private int costo;
    private String empresa;
    private  String listaDeCanales;

    public Contrato(){}

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getListaDeCanales() {
        return listaDeCanales;
    }

    public void setListaDeCanales(String listaDeCanales) {
        this.listaDeCanales = listaDeCanales;
    }

    public void showInfo() {
        System.out.println("Costo: "+ costo);
        System.out.println("Empresa: "+ empresa);
        System.out.println("Lista De Canales  "+ listaDeCanales);
    }

}
