package examenPrimerParcialB.ejercicio3;

public class CreatorPelotaFutbol extends Creator{
    @Override
    public PelotaFutbol createProduct() {
        PelotaFutbol pelota = new PelotaFutbol();
        pelota.setNombre("Pelota");
        pelota.setColor("Azul");
        pelota.setGarantia(true);
        pelota.setTamano("Grande");
        return pelota;
    }
}
