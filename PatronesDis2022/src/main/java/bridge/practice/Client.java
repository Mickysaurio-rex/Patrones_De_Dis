package bridge.practice;

public class Client {
    public static void main(String[]args){
        EmpresaSA empresaSA = new EmpresaSA();
        EmpresaSRL empresaSRL = new EmpresaSRL();

        empresaSA.setMedio(new Aire());
        empresaSRL.setMedio(new Tierra());


        empresaSA.enviar(new Paquete("Llanta", 120));
        empresaSRL.enviar(new Paquete("Vasos", 150));

        empresaSA.setMedio(new Mar());
        empresaSA.enviar(new Paquete("Medicamentos", 220));

    }
}
