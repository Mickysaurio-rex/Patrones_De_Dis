package changeResponsability.practice.ejercicio2;

public class Client {
    public static void main(String[]args) {

        Manager manager = new Manager();
        Persona[] personas = new Persona[10];

        personas[0] = new Persona("Miguel", "123", 12);
        personas[1] = new Persona("Juan", "1234", 19);
        personas[2] = new Persona("Maria", "1235", 13);
        personas[3] = new Persona("Lucia", "1236", 11);
        personas[4] = new Persona("Juana", "123", 15);
        personas[5] = new Persona("Jose", "123", 18);
        personas[6] = new Persona("Richy", "123", 22);
        personas[7] = new Persona("Gabriel", "123", 25);
        personas[8] = new Persona("Julian", "123", 19);
        personas[9] = new Persona("Lisa", "123", 22);


        System.out.println("LISTA SIN ORDENAR");
        System.out.println();
        System.out.println();
        for(int w = 0; w<personas.length; w++){
            System.out.println("Datos Persona ---> " + personas[w].getNombre() + ", " + personas[w].getEdad());
        }

        manager.criteriaHandler(personas);

        System.out.println("LISTA  ORDENADA");
        System.out.println();
        System.out.println();
        for(int w = 0; w<personas.length; w++){
            System.out.println("Datos Persona ---> " + personas[w].getNombre() + ", " + personas[w].getEdad());
        }
    }
}
