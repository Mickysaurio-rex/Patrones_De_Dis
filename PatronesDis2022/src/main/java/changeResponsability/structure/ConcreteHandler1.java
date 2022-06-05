package changeResponsability.structure;

public class ConcreteHandler1 implements  IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        if(amount < 100){
            System.out.println("ConcreteHandler1 lo esta resolviendo: " + amount);
        }else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
