package singleton.practice.ejercicio1;

public class Persona {
    private String nombre;
    private String ci;
    private String ciudad;

    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public String getCi() {
        return ci;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
