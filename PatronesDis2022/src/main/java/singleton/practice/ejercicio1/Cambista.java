package singleton.practice.ejercicio1;

public class Cambista {
    private Persona persona;

    public Cambista(Persona persona) {
        this.persona = persona;
    }

    public void cambiarMoneda(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){
        System.out.println(persona.getNombre() + " Solicita cambiar " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        SingletonCambio.getInstance().conversionMonedas(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();
    }
}
