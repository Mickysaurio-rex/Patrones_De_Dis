package examenPrimerParcialB.ejercicio3;

public class CreatorShort extends Creator{

    @Override
    public Shorts createProduct() {
        Shorts shorts = new Shorts();
        shorts.setNombre("Camiseta");
        shorts.setColor("Rojo");
        shorts.setGarantia(true);
        shorts.setTamano("S");
        return shorts;
    }
}
