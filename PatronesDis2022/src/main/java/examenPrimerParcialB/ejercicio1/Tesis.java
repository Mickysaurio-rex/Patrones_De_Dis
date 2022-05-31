package examenPrimerParcialB.ejercicio1;

import java.util.Date;

public class Tesis {
    private String titulo;
    private String mencion;
    private Estudiante datosEstudiante;

    private Date fecha = new Date();

    public Tesis() {}


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMencion() {
        return mencion;
    }

    public void setMencion(String mencion) {
        this.mencion = mencion;
    }

    public Estudiante getDatosEstudiante() {
        return datosEstudiante;
    }

    public void setDatosEstudiante(Estudiante datosEstudiante) {
        this.datosEstudiante = datosEstudiante;
    }
}
