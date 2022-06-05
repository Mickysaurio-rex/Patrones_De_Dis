package changeResponsability.practice.ejercicio1;


public class Notario implements IAtencion {
    private IAtencion next;
    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Requisitos requisitos) {
        if(!requisitos.isCertificadoNacimiento()&&requisitos.isFichaAtencion()&&requisitos.isPagoAlBanco()){
            System.out.println("Nos falta certificado de nacimiento");
        }else{
            next.criteriaHandler(requisitos);
        }
    }

    @Override
    public IAtencion next() {
        return next;
    }
}
