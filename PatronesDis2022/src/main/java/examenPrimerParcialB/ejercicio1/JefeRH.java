package examenPrimerParcialB.ejercicio1;
import java.util.Date;
public class JefeRH {
    private String nombre;
    private String ci;

    public JefeRH() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void registrarTesis(Tesis tesis) {
        InfoTesis.getInstance().registrarTesis(tesis);
    }

    public void mostrarDatosRegistro(Tesis tesis) {
        InfoTesis.getInstance().mostrarRegistro(tesis);
    }
}
