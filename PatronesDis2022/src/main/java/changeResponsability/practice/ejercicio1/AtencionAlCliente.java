package changeResponsability.practice.ejercicio1;


public class AtencionAlCliente implements IAtencion {
    private IAtencion next;
    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Requisitos requisitos) {
        if(!requisitos.isCertificadoNacimiento()&&!requisitos.isFichaAtencion()
        || !requisitos.isPagoAlBanco()&&!requisitos.isFichaAtencion()
        || !requisitos.isPagoAlBanco()&&!requisitos.isCertificadoNacimiento()
        || !requisitos.isPagoAlBanco()&&!requisitos.isFichaAtencion()&&requisitos.isCertificadoNacimiento()){
            System.out.println("Nos falta mas de un requisito");
        }else{
            next.criteriaHandler(requisitos);
        }
    }

    @Override
    public IAtencion next() {
        return next;
    }
}
