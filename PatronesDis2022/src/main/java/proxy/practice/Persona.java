package proxy.practice;

public class Persona {
    private String nombre;
    private String celular;
    private String carnet;

    public Persona(String nombre, String celular, String carnet) {
        this.nombre = nombre;
        this.celular = celular;
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public String getCarnet() {
        return carnet;
    }
}
