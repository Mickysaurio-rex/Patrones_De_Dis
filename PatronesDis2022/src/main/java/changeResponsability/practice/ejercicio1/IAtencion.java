package changeResponsability.practice.ejercicio1;

public interface IAtencion {

    void setNext(IAtencion handler);//setear al siguiente responsable

    void criteriaHandler(Requisitos requisitos);//el objeto para manejar

    IAtencion next();
}
