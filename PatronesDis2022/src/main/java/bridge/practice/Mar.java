package bridge.practice;

public class Mar implements IMedio{

    @Override
    public void enviar(Paquete paquete) {
        System.out.println("Mandando por barco");
        double aumento = paquete.getPrecio()/2;
        paquete.setPrecio(aumento+ paquete.getPrecio());
        paquete.mostrar();
    }
}
