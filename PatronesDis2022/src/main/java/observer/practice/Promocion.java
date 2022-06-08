package observer.practice;

public class Promocion {
    String mensaje;
    String categoria;

    public Promocion(String mensaje, String categoria) {
        this.mensaje = mensaje;
        this.categoria = categoria;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void showInfo() {
        System.out.println("*****- informacion del mensaje -*****");
        System.out.println("mensaje: " + mensaje);
        System.out.println("categoria: " + categoria);
    }
}
