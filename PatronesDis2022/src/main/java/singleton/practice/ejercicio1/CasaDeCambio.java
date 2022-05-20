package singleton.practice.ejercicio1;

public class CasaDeCambio {
    private Persona persona;

    public CasaDeCambio(Persona persona) {
        this.persona = persona;
    }

    public void cambiarMonedas(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){
        System.out.println(persona.getNombre() + " Solicita cambio en una casa de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        SingletonCambio.getInstance().conversionMonedas(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();
    }
}
