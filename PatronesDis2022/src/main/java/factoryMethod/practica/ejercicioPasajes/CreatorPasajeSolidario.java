package factoryMethod.practica.ejercicioPasajes;

public class CreatorPasajeSolidario extends Creator{
    @Override
    public PasajeSolidario createProduct(Pasajero persona) {
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

        PasajeSolidario pasajeSolidario = new PasajeSolidario(destino,origen,avion,persona);
        pasajeSolidario.setNumeroVuelo(34);
        pasajeSolidario.setNumeroAsiento(45);
        pasajeSolidario.setCostoPasaje(100);
        pasajeSolidario.setDescuento(300);
        pasajeSolidario.setMotivoDescuento("Cupon de descuento");
        return pasajeSolidario;
    }
}
