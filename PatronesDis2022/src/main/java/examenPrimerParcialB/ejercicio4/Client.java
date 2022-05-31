package examenPrimerParcialB.ejercicio4;

public class Client {
    public static void main(String[] args) {
        Proveedor jose = new Proveedor();
        BuilderContrato contrato1 = new ContratoHBO();
        BuilderContrato contrato2 = new ContratoNETFLIX();
        BuilderContrato contrato3 = new ContratoAMAZON();

        jose.setBuilder(contrato1);
        jose.realizarContrato();
        Contrato cnt1 = jose.getContratoRealizado();

        System.out.println("************Contrato HBO************");
        cnt1.showInfo();

        jose.setBuilder(contrato2);
        jose.realizarContrato();
        Contrato cnt2 = jose.getContratoRealizado();

        System.out.println("************Contrato NETFLIX************");
        cnt2.showInfo();

        jose.setBuilder(contrato3);
        jose.realizarContrato();
        Contrato cnt3 = jose.getContratoRealizado();

        System.out.println("************Contrato AMAZON************");
        cnt3.showInfo();
    }
}
