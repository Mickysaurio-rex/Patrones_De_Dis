package factoryMethod.practica.ejercicioPasajes;

import prototype.example.entradas.Persona;

public class Client {
    public static void main (String []args){
        Pasajero pe1 = new Pasajero();
        pe1.setNombre("Nestor Alvarez");
        pe1.setCarnet(5457849);

        Pasajero pe2 = new Pasajero();
        pe2.setNombre("Adrian Ticona");
        pe2.setCarnet(374834);

        Pasajero pe3 = new Pasajero();
        pe3.setNombre("Luis Taboada");
        pe3.setCarnet(7839532);

        Pasajero pe4 = new Pasajero();
        pe4.setNombre("Daniel Quisbert");
        pe4.setCarnet(4352222);

        Pasajero pe5 = new Pasajero();
        pe5.setNombre("Daniel Caceres");
        pe5.setCarnet(5457849);

        Pasajero pe6 = new Pasajero();
        pe6.setNombre("Diego Rodriguez");
        pe6.setCarnet(378542);

        PasajeStandart p1 = new CreatorPasajeStandart().createProduct(pe1);
        p1.setNumeroAsiento(56);
        p1.showInfo();

        PasajeStandart p4 = new CreatorPasajeStandart().createProduct(pe2);
        p4.setNumeroAsiento(45);
        p4.showInfo();

        PasajeSolidario p2 = new CreatorPasajeSolidario().createProduct(pe3);
        p2.setNumeroAsiento(35);
        p2.showInfo();

        PasajeSolidario p5 = new CreatorPasajeSolidario().createProduct(pe4);
        p5.setNumeroAsiento(23);
        p5.showInfo();

        PasajeInfantes p3 = new CreatorPasajeInfantes().createProduct(pe5);
        p3.setNumeroAsiento(15);
        p3.showInfo();

        PasajeInfantes p6 = new CreatorPasajeInfantes().createProduct(pe6);
        p6.setNumeroAsiento(82);
        p6.showInfo();

    }
}
