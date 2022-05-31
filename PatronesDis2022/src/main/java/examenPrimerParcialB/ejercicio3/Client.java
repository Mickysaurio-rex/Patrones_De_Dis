package examenPrimerParcialB.ejercicio3;

public class Client {
    public static void main (String []args){
        Camiseta cm1 = new CreatorCamiseta().createProduct();
        cm1.setCosto(100);
        cm1.showInfo();

        Medias medias = new CreatorMedias().createProduct();
        medias.setCosto(50);
        medias.showInfo();

        PelotaFutbol pelota = new CreatorPelotaFutbol().createProduct();
        pelota.setCosto(40);
        pelota.showInfo();

        Shorts shorts = new CreatorShort().createProduct();
        shorts.setCosto(600);
        shorts.showInfo();

        Tenis tenis = new CreatorTenis().createProduct();
        medias.setCosto(340);
        medias.showInfo();

    }


}
