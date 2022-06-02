package mediator.example;

public class Profesional extends Persona{

    public Profesional(ICanalComunicacion canalComunicacion) {
        super(canalComunicacion);
    }

    @Override
    public void send(String msg) {
        canalComunicacion.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO ---> cargo: " + getCargo() +" ci: "  + getCi() + " nombre: " + getNombre());
        System.out.println("INFO ---> received " + msg);
    }
}
