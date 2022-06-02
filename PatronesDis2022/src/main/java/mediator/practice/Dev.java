package mediator.practice;


public class Dev extends Persona {

    private String lenguaje;

    public Dev(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void send(String msg) {
        canalComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getName() + " CI: " + getCi() + " Grado: " + lenguaje + ", recibio el mensaje: "
                + msg);
    }
}
