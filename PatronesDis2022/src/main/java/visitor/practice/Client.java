package visitor.practice;

public class Client {
    public static void main (String[]args){
        Bolivia bolivia = new Bolivia();
        bolivia.setCambioC(6.8000);
        bolivia.setCambioV(6.9500);
        Argentina argentina = new Argentina();
        argentina.setCambioC(122.8500);
        argentina.setCambioV(122.8700);
        Brasil brasil = new Brasil();
        brasil.setCambioC(5.1530);
        brasil.setCambioV(5.1550);
        Italia italia = new Italia();
        italia.setCambioC(1865.5831);
        italia.setCambioV(1865.5831);
        Viajero viajero = new Viajero();

        viajero.setMontoACambiar(100);

        bolivia.accept(viajero, "Cambiar a moneda local");
        argentina.accept(viajero, "Cambiar a moneda local");
        brasil.accept(viajero, "Cambiar a moneda local");
        italia.accept(viajero, "Cambiar a moneda local");

    }

}
