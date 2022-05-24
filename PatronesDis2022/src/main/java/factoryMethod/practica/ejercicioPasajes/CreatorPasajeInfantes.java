package factoryMethod.practica.ejercicioPasajes;

public class CreatorPasajeInfantes extends Creator{
    @Override
    public PasajeInfantes createProduct(Pasajero persona) {
        Lugar destino = new Lugar();
        destino.setPais("Peru");
        destino.setCiudad("Lima");
        destino.setAeropuerto("Aeropuerto Internacional Jorge Chávez");

        Lugar origen = new Lugar();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setAeropuerto("Aeropuerto Internacional Manuel Márquez de León");

        Avion avion = new Avion();
        avion.setModelo("Alas de Libertad");
        avion.setMarca("Boeing 737-800");
        avion.setCapacidad(168);
        avion.setNumeroAsientos(278);

        PasajeInfantes pasajeInfantes = new PasajeInfantes(destino,origen,avion,persona);
        pasajeInfantes.setNumeroVuelo(34);
        pasajeInfantes.setNumeroAsiento(28);
        pasajeInfantes.setCostoEspecial(150);
        return pasajeInfantes;
    }
}
