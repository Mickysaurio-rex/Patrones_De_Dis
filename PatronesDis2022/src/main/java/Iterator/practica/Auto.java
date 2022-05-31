package Iterator.practica;

public class Auto {
    private int costo;
    private String modelo;
    private int nroDeAsientos;
    private String tipo;
    public Auto(){}

    public Auto(int costo, String modelo, int nroDeAsientos, String tipo) {
        this.costo = costo;
        this.modelo = modelo;
        this.nroDeAsientos = nroDeAsientos;
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNroDeAsientos() {
        return nroDeAsientos;
    }

    public void setNroDeAsientos(int nroDeAsientos) {
        this.nroDeAsientos = nroDeAsientos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
