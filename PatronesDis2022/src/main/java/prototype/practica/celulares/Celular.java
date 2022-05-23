package prototype.practica.celulares;

public class Celular implements ICelular {
    private String tamano;
    private String memory;
    private String cpu;
    private String tipoBateria;
    private String versionAndroid;
    private int pixeles;
    private Double bluetooth;
    private int cantidadDeMemoriasExternas;
    private Accesorios accesorios = new Accesorios();
    private Sim chip = new Sim();

    public Celular(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Sim getChip() {
        return chip;
    }

    public void setChip(Sim chip) {
        this.chip = chip;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public int getPixeles() {
        return pixeles;
    }

    public void setPixeles(int pixeles) {
        this.pixeles = pixeles;
    }

    public Double getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Double bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {
        Accesorios accesoriosC = new Accesorios();
        accesoriosC.setAudifonos(this.getAccesorios().getAudifonos());
        accesoriosC.setCargador(this.getAccesorios().getCargador());
        accesoriosC.setEstuche(this.getAccesorios().getEstuche());

        Sim chipC = new Sim();
        chipC.setNumeroCelular(this.getChip().getNumeroCelular());
        chipC.setNombreEmpresa(this.getChip().getNombreEmpresa());

        Celular clone = new Celular();
        clone.setTamano(this.getTamano());
        clone.setMemory(this.getMemory());
        clone.setCpu(this.getCpu());
        clone.setTipoBateria(this.getTipoBateria());
        clone.setVersionAndroid(this.getVersionAndroid());
        clone.setPixeles(this.getPixeles());
        clone.setBluetooth(this.getBluetooth());
        clone.setCantidadDeMemoriasExternas(this.getCantidadDeMemoriasExternas());
        clone.setAccesorios(accesoriosC);
        clone.setChip(chipC);

        return clone;
    }
    public void showInfo(){
        System.out.println(" \n ****  Informacion del Celular *** \n");
        System.out.println("El tamaño es: " + tamano);
        System.out.println("El cpu es: " + cpu);
        System.out.println("Las memoria son de: " + memory);
        System.out.println("La empresa de telefonia es: " + chip.getNombreEmpresa());
        System.out.println("El numero de telefono es: " + chip.getNumeroCelular());
        System.out.println("La version de Android es: " + versionAndroid);
        System.out.println("La pixeles de la camara es de: " + pixeles);
        System.out.println("El bluetooth es: " + bluetooth);
        System.out.println("La cantidad de memorias externas es: " + cantidadDeMemoriasExternas + " ranura(s)");
        System.out.println("El tipo de bateria es: " + tipoBateria);
        System.out.println("El celular cuenta con: " + accesorios.getAudifonos() + ", " + accesorios.getCargador() +
                " y " + accesorios.getEstuche());
    }

}
