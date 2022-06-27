package decorator.practice;

public class Client {
    public static void main (String []args){
        ICuenta cuentaBancaria = new CuentaBancaria(100, "Carlos Gonzales", false);
        cuentaBancaria.showInfo();

        cuentaBancaria = new Promocion(cuentaBancaria);
        cuentaBancaria = new Seguro(cuentaBancaria);
        cuentaBancaria = new BancaInternet(cuentaBancaria);

        cuentaBancaria.showInfo();
    }
}
