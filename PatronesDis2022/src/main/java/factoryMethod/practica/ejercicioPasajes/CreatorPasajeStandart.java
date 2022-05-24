package factoryMethod.practica.ejercicioPasajes;

public class CreatorPasajeStandart extends Creator {
    @Override
    public PasajeStandart createProduct(Pasajero persona) {
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

        PasajeStandart pasajeStandart = new PasajeStandart(destino,origen,avion,persona);
        pasajeStandart.setNumeroVuelo(34);
        pasajeStandart.setCostoPasaje(400);

        return pasajeStandart;
    }


}
