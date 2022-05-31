package examenPrimerParcialB.ejercicio1;
import java.util.Date;
public class Client {
    public static void main(String[] args)  {

        JefeRH ramiro  = new JefeRH();
        ramiro.setCi("6897611LP");
        ramiro.setNombre("Ramiro");

        Estudiante es1 = new Estudiante();
        es1.setCi("3554646LP");
        es1.setNombre("Nestor");
        Tesis tesis1 = new Tesis();
        tesis1.setTitulo("Ingenieria Industrial");
        tesis1.setMencion("Industria");
        tesis1.setDatosEstudiante(es1);


        Estudiante es2 = new Estudiante();
        es2.setCi("54785496LP");
        es2.setNombre("Luis");
        Tesis tesis2 = new Tesis();
        tesis2.setTitulo("Biologia");
        tesis2.setMencion("Conservacion");
        tesis2.setDatosEstudiante(es2);


        Estudiante es3 = new Estudiante();
        es3.setCi("43758359LP");
        es3.setNombre("Adrian");
        Tesis tesis3 = new Tesis();
        tesis3.setTitulo("Derecho");
        tesis3.setMencion("Defensa");
        tesis3.setDatosEstudiante(es3);

        Estudiante es4 = new Estudiante();
        es4.setCi("83489795LP");
        es4.setNombre("Tito");
        Tesis tesis4 = new Tesis();
        tesis4.setTitulo("Ing De Sistemas");
        tesis4.setMencion("Programas");
        tesis4.setDatosEstudiante(es4);



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ramiro.registrarTesis(tesis1);
                ramiro.mostrarDatosRegistro(tesis1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ramiro.registrarTesis(tesis2);
                ramiro.mostrarDatosRegistro(tesis2);

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                ramiro.registrarTesis(tesis3);
                ramiro.mostrarDatosRegistro(tesis3);

            }
        });


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

                ramiro.registrarTesis(tesis4);
                ramiro.mostrarDatosRegistro(tesis4);

            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {

                ramiro.registrarTesis(tesis1);
                ramiro.mostrarDatosRegistro(tesis1);

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
