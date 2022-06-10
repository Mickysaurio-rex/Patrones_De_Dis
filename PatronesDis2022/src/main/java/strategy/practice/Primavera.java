package strategy.practice;

import java.util.List;

public class Primavera implements IEstacion{

    @Override
    public void estrategiaVentas(List<Ropa> inventario) {
        System.out.println("******TEMPORADA DE PRIMAVERA******");
        for (Ropa ropa:inventario) {
            ropa.showInfo();
        }
    }
}
