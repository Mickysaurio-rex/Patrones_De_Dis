package observer.practice;

public interface ITelefonica {
    void realizarUnContrato(IUser user);
    void detach(IUser user);
    void notifyObservers(Promocion promocion);
}
