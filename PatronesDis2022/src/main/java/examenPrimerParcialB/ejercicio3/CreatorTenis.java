package examenPrimerParcialB.ejercicio3;

public class CreatorTenis extends Creator{
    @Override
    public Tenis createProduct() {
        Tenis tenis = new Tenis();
        tenis.setNombre("Tenis");
        tenis.setColor("Naranja");
        tenis.setGarantia(true);
        tenis.setTamano("Grande");
        return tenis;
    }
}
