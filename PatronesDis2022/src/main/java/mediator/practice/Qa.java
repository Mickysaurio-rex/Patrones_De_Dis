package mediator.practice;


public class Qa extends Persona {

    private String grado;

    public Qa(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getGrado() {
        return grado;
    }

    public Qa setGrado(String grado) {
        this.grado = grado;
        return this;
    }

    @Override
    public void send(String msg) {
        canalComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getName() + " CI: " + getCi() + " Grado: " + grado + ", recibio el mensaje: "
                + msg);
    }
}
