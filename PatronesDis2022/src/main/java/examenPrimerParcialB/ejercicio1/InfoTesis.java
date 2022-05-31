package examenPrimerParcialB.ejercicio1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoTesis {

    private static InfoTesis instance;
    private List<Tesis> registro = new ArrayList<Tesis>();

    private InfoTesis() {}

    private synchronized static void multiThreadControl() {
        if(instance == null) {
            instance = new InfoTesis();
        }
    }

    public static InfoTesis getInstance() {
        if(instance == null) {
            multiThreadControl();
        }
        return instance;
    }

    public synchronized void registrarTesis(Tesis tesis) {

        if(!registro.contains(tesis)) {
            System.out.println("Tesis: " + tesis.getDatosEstudiante().getNombre()
                    + " registrado en fecha: " + tesis.getFecha());
            registro.add(tesis);
        } else {
            System.out.println("La tesis está duplicada");

        }

    }

    public synchronized void mostrarRegistro(Tesis tesis) {

                System.out.println(tesis.getTitulo() + ", " + tesis.getMencion()
                        + ", " + tesis.getDatosEstudiante().getNombre() + ", "
                        + tesis.getDatosEstudiante().getCi());
        }
    }

