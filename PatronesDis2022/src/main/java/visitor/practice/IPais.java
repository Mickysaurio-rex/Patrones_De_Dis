package visitor.practice;


public interface IPais {
    void accept(IPersona visitor, String operacion);
    void setCambioC(Double monto);
    void setCambioV(Double monto);
}
