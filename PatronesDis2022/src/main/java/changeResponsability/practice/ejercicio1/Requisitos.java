package changeResponsability.practice.ejercicio1;

public class Requisitos {
    private boolean certificadoNacimiento;
    private boolean pagoAlBanco;
    private boolean fichaAtencion;


    public Requisitos(boolean certificadoNacimiento, boolean pagoAlBanco, boolean fichaAtencion) {
        this.certificadoNacimiento = certificadoNacimiento;
        this.pagoAlBanco = pagoAlBanco;
        this.fichaAtencion = fichaAtencion;
    }

    public boolean isCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(boolean certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public boolean isPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(boolean pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public boolean isFichaAtencion() {
        return fichaAtencion;
    }

    public void setFichaAtencion(boolean fichaAtencion) {
        this.fichaAtencion = fichaAtencion;
    }
}
