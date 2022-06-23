package bridge.practice;

public class Aire implements IMedio{

    @Override
    public void enviar(Paquete paquete) {
        System.out.println("Mandando por aire");
        double aumento = paquete.getPrecio()*0.1;
        paquete.setPrecio(aumento + paquete.getPrecio());
        paquete.mostrar();
    }
}
