package changeResponsability.structure;

public class ConcreteHandler2 implements  IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int amount) {
        if(amount >= 100 && amount < 200){
            System.out.println("ConcreteHandler2 lo esta resolviendo: " + amount);
        }else {
            next.criteriaHandler(amount);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
