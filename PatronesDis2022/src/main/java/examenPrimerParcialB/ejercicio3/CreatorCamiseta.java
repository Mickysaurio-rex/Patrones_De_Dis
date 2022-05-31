package examenPrimerParcialB.ejercicio3;

public class CreatorCamiseta extends Creator{

    @Override
    public Camiseta createProduct() {
        Camiseta camiseta = new Camiseta();
        camiseta.setNombre("Camiseta");
        camiseta.setColor("Rojo");
        camiseta.setGarantia(true);
        camiseta.setTamano("M");
        return camiseta;
    }
}
