package decorator.practice;

public class Seguro extends Funcionalidades{
    public Seguro(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void showInfo(){
        System.out.println("Pagando seguro");
        int nuevoSaldo = cuenta.getMonto() - 15;
        cuenta.setMonto(nuevoSaldo);
        super.showInfo();
    }
}
