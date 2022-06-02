package mediator.practice;


public class Sm extends Persona {

    private String certificaciones;

    public Sm(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    @Override
    public void send(String msg) {
        canalComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getName() + " CI: " + getCi() + " Grado: " + certificaciones
                + ", recibio el mensaje: "
                + msg);
    }
}
