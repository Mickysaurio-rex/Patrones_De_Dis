package mediator.example;

public abstract class Persona {
    protected ICanalComunicacion canalComunicacion;

    private String ci;
    private String nombre;
    private String cargo;

    public Persona(ICanalComunicacion canalComunicacion){
        this.canalComunicacion =  canalComunicacion;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Persona setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
