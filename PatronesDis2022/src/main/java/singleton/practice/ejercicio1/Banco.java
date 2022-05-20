package singleton.practice.ejercicio1;

public class Banco {
    private Persona persona;
    private String nombre;
    public Banco(Persona persona, String nombre) {
        this.persona = persona;
        this.nombre = nombre;
    }

    public void cambiarMoneda(int cantidad, String tipoDivisaEntregada, String tipoDivisaACambiar){
        System.out.println(persona.getNombre() + " Solicita cambio con el banco de " + tipoDivisaEntregada + " a " + tipoDivisaACambiar);
        SingletonCambio.getInstance().conversionMonedas(cantidad, tipoDivisaEntregada, tipoDivisaACambiar);
        System.out.println();
    }
}
