package proxy.practice;

public class Cuenta implements IManejo{

    private String cuenta;
    private int saldo;
    private Persona usuario;

    public Cuenta(String cuenta, int saldo, Persona usuario) {
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public String getCuenta() {
        return cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void realizarCompra(Pago pago) {
        pago.showInfo();
        setSaldo(saldo - pago.getMonto());
        System.out.println("Se realizo el pago");
    }
}
