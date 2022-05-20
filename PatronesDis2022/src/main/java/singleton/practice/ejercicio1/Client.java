package singleton.practice.ejercicio1;

public class Client {
    public static void main(String[] args) {
        Persona nestor = new Persona();
        nestor.setNombre("Nestor");
        nestor.setCi("2352653");
        nestor.setCiudad("La Paz");

        Persona daniel = new Persona();
        daniel.setNombre("Daniel");
        daniel.setCi("2879133");
        daniel.setCiudad("Oruro");

        Persona luis = new Persona();
        luis.setNombre("Luis");
        luis.setCi("2780398");
        luis.setCiudad("Cochabamba");


        Banco banco = new Banco(nestor,"Banco Union");
        banco.cambiarMoneda(100,"Dolar","Boliviano");
        banco.cambiarMoneda(50,"Boliviano","Euro");


        CasaDeCambio casaDeCambio = new CasaDeCambio(luis);
        casaDeCambio.cambiarMonedas(69,"Euro","Boliviano");
        casaDeCambio.cambiarMonedas(24000,"Boliviano","Dolar");

        //Creamos Librecambistas
        Cambista libreCambista = new Cambista(daniel);
        libreCambista.cambiarMoneda(550,"Boliviano","Euro");
    }
}
