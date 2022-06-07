package command.practice;

public class Juego {
    private String name;
    private String version;
    private double precio;

    public Juego(){
    }

    public String getName() {
        return name;
    }

    public Juego setName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Juego setVersion(String version) {
        this.version = version;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Juego setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public void disparar(){
        System.out.println("Piu Piu");
    }

    public void modoDefensa(){
        System.out.println("Se protege");
    }

    public void atacar(){
        System.out.println("te veo y te mato");
        System.out.println("lo mata");
    }


}