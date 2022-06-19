package visitor.practice;


import java.text.DecimalFormat;

public class Viajero implements IPersona {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    double montoACambiar;


    @Override
    public void cambioD(Bolivia bolivia) {
        double dinero;
        dinero = montoACambiar/bolivia.getCambioC();
        System.out.println("Usted cambio " + montoACambiar + " Bs ---> " + df.format(dinero) + " $");
    }

    @Override
    public void cambioL(Bolivia bolivia) {
        double dinero;
        dinero = montoACambiar * bolivia.getCambioV();
        System.out.println("Usted cambio " + montoACambiar + " $ ---> " + df.format(dinero) + " Bs");
    }


    @Override
    public void cambioD(Argentina argentina) {
        double dinero;
        dinero = montoACambiar/argentina.getCambioC();
        System.out.println("Usted cambio " + montoACambiar + " Pesos Argentinos ---> " + df.format(dinero) + " $");
    }

    @Override
    public void cambioL(Argentina argentina) {
        double dinero;
        dinero = montoACambiar*argentina.getCambioV();
        System.out.println("Usted cambio " + montoACambiar + " $ ---> " + df.format(dinero) + " Pesos Argentinos");
    }

    @Override
    public void cambioD(Brasil brasil) {
        double dinero;
        dinero = montoACambiar/brasil.getCambioC();
        System.out.println("Usted cambio " + montoACambiar + " R$ ---> " + df.format(dinero) + " $");
    }

    @Override
    public void cambioL(Brasil brasil) {
        double dinero;
        dinero = montoACambiar*brasil.getCambioV();
        System.out.println("Usted cambio " + montoACambiar + " $ ---> " + df.format(dinero) + " R$");
    }

    @Override
    public void cambioD(Italia italia) {
        double dinero;
        dinero = montoACambiar/italia.getCambioC();
        System.out.println("Usted cambio " + montoACambiar + " L ---> " + df.format(dinero) + " $");
    }

    @Override
    public void cambioL(Italia italia) {
        double dinero;
        dinero = montoACambiar*italia.getCambioV();
        System.out.println("Usted cambio " + montoACambiar + " $ ---> " + df.format(dinero) + " L");
    }

    public void setMontoACambiar(double montoACambiar) {
        this.montoACambiar = montoACambiar;
    }
}

