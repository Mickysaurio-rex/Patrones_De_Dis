package strategy.practice;

import java.util.List;

public class Otono implements IEstacion{

    @Override
    public void estrategiaVentas(List<Ropa> inventario) {
        System.out.println("******TEMPORADA DE OTONO******");
        for (Ropa ropa:inventario) {
            ropa.setPrecio(ropa.getPrecio()/2);
            ropa.showInfo();
        }
    }
}
