package changeResponsability.practice.ejercicio2;


public interface IOrganizador {
    void setNext(IOrganizador handler);//setear al siguiente responsable

    void criteriaHandler(Persona[] personas);//el objeto para manejar

    IOrganizador next();
}
