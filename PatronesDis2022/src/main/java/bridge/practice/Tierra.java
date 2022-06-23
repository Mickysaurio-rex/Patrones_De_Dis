package bridge.practice;

public class Tierra implements IMedio{

    @Override
    public void enviar(Paquete paquete) {
        System.out.println("Mandando por tierra");
        double aumento = paquete.getPrecio()*0.05;
        paquete.setPrecio(aumento+ paquete.getPrecio());
        paquete.mostrar();
    }
}
