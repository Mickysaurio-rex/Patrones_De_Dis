package strategy.practice;

import java.util.List;

public class Verano implements IEstacion{

    @Override
    public void estrategiaVentas(List<Ropa> inventario) {
        System.out.println("******TEMPORADA DE VERANO******");
        for (Ropa ropa:inventario) {
            double aumento = ropa.getPrecio()*0.10;
            ropa.setPrecio(ropa.getPrecio()-aumento);
            ropa.showInfo();
        }
    }
}
