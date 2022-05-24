package factoryMethod.practica.ejercicioPasajes;

public class PasajeStandart implements IPasaje{
    private int numeroVuelo;
    private Lugar destino;
    private Lugar origen;
    private Avion avion;
    private Pasajero pasajero;
    private int numeroAsiento;
    private int costoPasaje;

    public PasajeStandart (Lugar destino, Lugar origen, Avion avion, Pasajero pasajero){
        this.destino=destino;
        this.origen=origen;
        this.avion=avion;
        this.pasajero=pasajero;
    }
    @Override
    public void showInfo() {
        System.out.println(" ************Pasaje Standart************ ");

        System.out.println(" Numero Vuelo: " + numeroVuelo);
        System.out.println(" Pais Destino: " + destino.getPais());
        System.out.println(" Ciudad Destino: " + destino.getCiudad());
        System.out.println(" Aeropuerto Destino: " + destino.getAeropuerto());
        System.out.println(" Pais Origen: " + origen.getPais());
        System.out.println(" Ciudad Origen: " + origen.getCiudad());
        System.out.println(" Aeropuerto Origen: " + origen.getAeropuerto());
        System.out.println(" Marca Avion: " + avion.getMarca());
        System.out.println(" Capacidad Avion: " + avion.getCapacidad());
        System.out.println(" Modelo avion: " + avion.getModelo());
        System.out.println(" Numero de Asientos: " + avion.getNumeroAsientos());
        System.out.println(" Nombre Pasajero: " + pasajero.getNombre());
        System.out.println(" CI Pasajero: " + pasajero.getCarnet());
        System.out.println(" Numero de Asiento: " + numeroAsiento);
        System.out.println(" Costo del Pasaje($): " + costoPasaje);
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public int getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(int costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
}
