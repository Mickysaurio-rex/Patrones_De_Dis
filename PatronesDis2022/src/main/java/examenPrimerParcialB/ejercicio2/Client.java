package examenPrimerParcialB.ejercicio2;


import prototype.practica.celulares.Celular;

public class Client {
    public static void main(String[]args){

        Camara camara = new Camara();
        camara.setFoco(10);
        camara.setLente("5mp");
        CelularA1 modelo = new CelularA1();
        modelo.setModelo("A1");
        modelo.setTamano("10 pulgadas");
        modelo.setPeso("60 gr");
        modelo.setCamara(camara);
        modelo.setOrigen("Bolivia");

        CelularA1 celular1 = (CelularA1) modelo.clone();
        celular1.setImei(1001);

        CelularA1 celular2 = (CelularA1) modelo.clone();
        celular2.setImei(1002);

        CelularA1 celular3 = (CelularA1) modelo.clone();
        celular3.setImei(1003);

        CelularA1 celular4 = (CelularA1) modelo.clone();
        celular4.setImei(1004);

        CelularA1 celular5 = (CelularA1) modelo.clone();
        celular5.setImei(1005);

        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();
        celular4.showInfo();
        celular5.showInfo();

    }

}
