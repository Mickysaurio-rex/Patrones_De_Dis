package proxy.practice;

public class Client {

    public static void main(String[]args){
        Cuenta cuenta = new Cuenta("0001023142", 800,
                new Persona("Miguel", "732983", "123"));

        TarjetaProxy tarjeta = new TarjetaProxy(cuenta);
        Pago pago1 = new Pago("Pago por un patito", "bolivianos", 300);
        Pago pago2 = new Pago("Pago por un anillo", "dolares", 2);
        Pago pago3 = new Pago("Pago por un pan", "euros", 1);

        tarjeta.realizarCompra(pago1);
        System.out.println(cuenta.getSaldo());
        tarjeta.realizarCompra(pago2);
        System.out.println(cuenta.getSaldo());
        tarjeta.realizarCompra(pago3);
        System.out.println(cuenta.getSaldo());
    }

}
