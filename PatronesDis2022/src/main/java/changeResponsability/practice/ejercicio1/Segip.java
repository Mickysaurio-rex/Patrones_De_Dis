package changeResponsability.practice.ejercicio1;


public class Segip implements IAtencion {
    private IAtencion next;
    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Requisitos requisitos) {
        if(requisitos.isCertificadoNacimiento()&&requisitos.isFichaAtencion()&&requisitos.isPagoAlBanco()){
            System.out.println("Se entrega el carnet");
        }else{
            next.criteriaHandler(requisitos);
        }
    }

    @Override
    public IAtencion next() {
        return next;
    }
}
