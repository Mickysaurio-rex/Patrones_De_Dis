package changeResponsability.structure;

public interface IHandler {
    void setNext(IHandler handler);//setear al siguiente responsable
    void criteriaHandler(int amount);//el objeto para manejar
    IHandler next();
}
