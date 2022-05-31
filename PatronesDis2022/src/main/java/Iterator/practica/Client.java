package Iterator.practica;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Impor1 im1 = new Impor1();
        im1.add(new Auto(100,"HYUNDAI",8, "VAGONETA"));

        Impor2 im2 = new Impor2();
        im2.add(new Auto(100,"GREAT WALL",5, "SEDAN"));

        Impor3 im3 = new Impor3();
        im3.add(new Auto(200,"LEXUS",8, "VAGONETA"));

        Impor4 im4 = new Impor4();
        im4.add(new Auto(150,"BMW",4, "DEPORTIVO"));

        Iterator iterator;
        Map<Auto, String> map = new HashMap<Auto, String>();

        iterator = im1.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        iterator = im2.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        iterator = im3.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        iterator = im4.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto, auto.getModelo());
        }

        for (Auto key : map.keySet()) {
            System.out.println("*********** DATOS AUTO ***********");
            System.out.println("MARCA: "+key.getModelo());
            System.out.println("COSTO: " + key.getCosto());
            System.out.println("NUMERO DE ASIENTOS: " + key.getNroDeAsientos());
            System.out.println("TIPO: " + key.getTipo());
        }

    }
}
