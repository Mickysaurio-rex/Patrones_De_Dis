package changeResponsability.practice.ejercicio2;



public class Manager implements IOrganizador {

    private IOrganizador next;

    @Override
    public void setNext(IOrganizador handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        Organizador1 resp1 = new Organizador1();
        this.setNext(resp1);

        Organizador2 resp2 = new Organizador2();
        resp1.setNext(resp2);

        Organizador3 resp3 = new Organizador3();
        resp2.setNext(resp3);


        this.next.criteriaHandler(personas);

    }

    @Override
    public IOrganizador next() {
        return next;
    }
}
