package observer.practice;

import java.util.ArrayList;
import java.util.List;

public class Telefonica implements ITelefonica{
    private List<Promocion> list = new ArrayList<>();
    private List<IUser> users= new ArrayList<>();

    public Telefonica(){}

    public void sendPromocion(Promocion promocion){
        list.add(promocion);
        notifyObservers(promocion);
    }

    @Override
    public void realizarUnContrato(IUser user) {
        users.add(user);
    }

    @Override
    public void detach(IUser user) {
        users.remove(user);
    }

    @Override
    public void notifyObservers(Promocion promocion) {
        for (IUser user : users) {
            if(user.getPreferenciaPromocion().equals(promocion.getCategoria())){
                user.update("Promocion mandada", promocion);
            }
        }
    }
}
