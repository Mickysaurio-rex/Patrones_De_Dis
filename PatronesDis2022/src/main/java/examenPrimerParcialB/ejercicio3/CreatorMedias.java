package examenPrimerParcialB.ejercicio3;

public class CreatorMedias extends Creator{
    @Override
    public Medias createProduct() {
        Medias medias = new Medias();
        medias.setNombre("Medias");
        medias.setColor("Verdes");
        medias.setGarantia(true);
        medias.setTamano("7/2");
        return medias;
    }
}
