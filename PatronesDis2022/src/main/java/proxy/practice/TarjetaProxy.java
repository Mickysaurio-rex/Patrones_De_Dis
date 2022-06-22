package proxy.practice;

public class TarjetaProxy implements IManejo{

    private Cuenta cuenta;

    public TarjetaProxy(Cuenta cuenta) {
        this.cuenta = cuenta;
    }


    @Override
    public void realizarCompra(Pago pago) {
        if(pago.getTipoDeMoneda().toLowerCase().equals("bolivianos")){
            if(pago.getMonto() < cuenta.getSaldo()){
                cuenta.realizarCompra(pago);
            }else{
                System.out.println("No te alcanza choco");
            }
        }else if(pago.getTipoDeMoneda().toLowerCase().equals("dolares")){
           pago.setMonto(pago.getMonto()*7);
            if(pago.getMonto() < cuenta.getSaldo()){
                cuenta.realizarCompra(pago);
            }else{
                System.out.println("No te alcanza choco");
            }
        }else if(pago.getTipoDeMoneda().toLowerCase().equals("euros")){
            pago.setMonto(pago.getMonto()*8);
            if(pago.getMonto() < cuenta.getSaldo()){
                cuenta.realizarCompra(pago);
            }else{
                System.out.println("No te alcanza choco");
            }
        }

    }
}
