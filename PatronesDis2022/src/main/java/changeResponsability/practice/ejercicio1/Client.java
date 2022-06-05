package changeResponsability.practice.ejercicio1;



public class Client {
    public static void main(String[]args){
        Manager manager = new Manager();
        manager.criteriaHandler(new Requisitos(true, true, true));
        manager.criteriaHandler(new Requisitos(true, true, false));
        manager.criteriaHandler(new Requisitos(true, true, true));
    }
}
