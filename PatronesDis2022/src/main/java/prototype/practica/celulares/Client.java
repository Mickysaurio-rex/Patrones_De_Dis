package prototype.practica.celulares;

public class Client {
    public static void main(String[]args){

        Sim empresa1 = new Sim();
        empresa1.setNombreEmpresa("Entel");
        empresa1.setNumeroCelular(64223794);

        Sim empresa2 = new Sim();
        empresa2.setNombreEmpresa("Viva");
        empresa2.setNumeroCelular(78930483);

        Sim empresa3 = new Sim();
        empresa3.setNombreEmpresa("Tigo");
        empresa3.setNumeroCelular(64839409);

        Accesorios accesoriosG = new Accesorios();
        accesoriosG.setAudifonos("Audifonos AKG color negro");
        accesoriosG.setCargador("Cargador de carga rapida, color blanco, 5V");
        accesoriosG.setEstuche("Funda de plastico, color azul");

        Accesorios accesoriosG2 = new Accesorios();
        accesoriosG2.setAudifonos("Audifonos AKG color blanco");
        accesoriosG2.setCargador("Cargador de carga rapida, color negro, 5V");
        accesoriosG2.setEstuche("Funda de plastico, color verde");

        Celular modelo = new Celular();
        modelo.setTamano("6,41 pulgadas, 1080 × 2340 px");
        modelo.setCpu("Octa core, 2.2 GHz");
        modelo.setMemory("6GB RAM y 64GB Interna");
        modelo.setVersionAndroid("Android v9.0 (Pie)");
        modelo.setPixeles(24);
        modelo.setBluetooth(5.0);
        modelo.setCantidadDeMemoriasExternas(1);
        modelo.setTipoBateria("4100 mAh Li-ion");

        Celular celular1 = (Celular) modelo.clone();
        celular1.setChip(empresa1);
        celular1.setAccesorios(accesoriosG);

        Celular celular2 = (Celular) modelo.clone();
        celular2.setChip(empresa2);
        celular2.setAccesorios(accesoriosG2);

        Celular celular3 = (Celular) modelo.clone();
        celular3.setChip(empresa3);
        celular3.setAccesorios(accesoriosG);

        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();
    }
}
