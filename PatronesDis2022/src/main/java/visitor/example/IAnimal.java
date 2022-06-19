package visitor.example;

public interface IAnimal {
    void accept(IMedico visitor);
    void setEnfermedad(String enfermedad);
}
