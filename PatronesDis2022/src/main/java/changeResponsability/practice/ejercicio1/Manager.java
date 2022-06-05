package changeResponsability.practice.ejercicio1;



public class Manager implements IAtencion{

    private IAtencion next;

    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Requisitos requisitos) {
        Notario resp1 = new Notario();
        this.setNext(resp1);

        CajeroBanco resp2 = new CajeroBanco();
        resp1.setNext(resp2);

        OrganizadorFichas resp3 = new OrganizadorFichas();
        resp2.setNext(resp3);

        AtencionAlCliente respF4 = new AtencionAlCliente();
        resp3.setNext(respF4);

        Segip respFinal = new Segip();
        respF4.setNext(respFinal);

        this.next.criteriaHandler(requisitos);

    }

    @Override
    public IAtencion next() {
        return next;
    }
}
