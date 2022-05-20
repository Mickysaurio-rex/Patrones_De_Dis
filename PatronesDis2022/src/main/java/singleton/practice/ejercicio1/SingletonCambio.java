package singleton.practice.ejercicio1;

public class SingletonCambio {
    private static SingletonCambio singletonCambio;
    private int cambioDol = 7;
    private int cambioEuro = 9;
    private int cambioBs = 1;

    private SingletonCambio(){
    }

    public static SingletonCambio getInstance(){
        if (singletonCambio==null)
            singletonCambio= new SingletonCambio();
        return singletonCambio;
    }

    public void conversionMonedas(int cantidad, String tipoDivisaEntregada , String tipoDivisaACambiar){
        if (tipoDivisaEntregada.equals("Boliviano") && tipoDivisaACambiar.equals("Dolar")){
            cambiarBsASus(cantidad);
        } else if (tipoDivisaEntregada.equals("Dolar") && tipoDivisaACambiar.equals("Boliviano")) {
            cambiarSusABs(cantidad);
        } else if (tipoDivisaEntregada.equals("Boliviano") && tipoDivisaACambiar.equals("Euro")) {
            cambiarBsAEuros(cantidad);
        } else if (tipoDivisaEntregada.equals("Euro") && tipoDivisaACambiar.equals("Boliviano")) {
            cambiarEurosABs(cantidad);
        }
    }

    public void cambiarBsASus(int Bs){
        int cambio = Bs/cambioDol;
        System.out.println("Bs: "+ Bs + "----> " + "$: " + cambio);
    }

    public void cambiarBsAEuros(int Bs){
        int cambio = Bs*cambioEuro;
        System.out.println("Bs: "+ Bs + "----> " + "€: " + cambio);
    }

    public void cambiarSusABs(int Sus){
        int cambio = cambioDol*Sus;
        System.out.println("$: "+ Sus + "----> " + "Bs: " + cambio);
    }
    public void cambiarEurosABs(int Euro){
        int cambio = cambioEuro*Euro;
        System.out.println("€: "+ Euro + "----> " + "Bs: " + cambio);
    }
}
