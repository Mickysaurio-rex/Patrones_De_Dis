package examenPrimerParcialB.ejercicio2;


public class CelularA1 implements ICelularA1 {
    private String modelo;
    private String tamano;
    private String peso;
    private Camara camara;
    private int imei;
    private String origen;

    public CelularA1(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Object clone() {
        Camara camara = new Camara();
        camara.setFoco(this.getCamara().getFoco());
        camara.setLente(this.getCamara().getLente());

        CelularA1 clone = new CelularA1();
        clone.setModelo(this.getModelo());
        clone.setTamano(this.getTamano());
        clone.setPeso(this.getPeso());
        clone.setCamara(camara);
        clone.setImei(this.getImei());
        clone.setOrigen(this.getOrigen());

        return clone;
    }

        public void showInfo(){
            System.out.println(" \n ****  Informacion del Celular *** \n");
            System.out.println("Modelo: " + modelo);
            System.out.println("El tamaño es: " + tamano);
            System.out.println("El peso es: " + peso);
            System.out.println("El foco de la camara es: " + camara.getFoco());
            System.out.println("Los megapixeles son: " + camara.getLente());
            System.out.println("Su imei es: " + imei);
            System.out.println("Pais Creado: " + origen);
        }
    }
