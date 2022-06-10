package strategy.practice;

public class Ropa {
    String tipo;
    double precio;
    double precioO;

    public Ropa(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
        this.precioO = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioO() {
        return precioO;
    }

    public void setPrecioO(double precioO) {
        this.precioO = precioO;
    }


    public void showInfo(){
        System.out.println("*********INFO ROPA*********");
        System.out.println("Tipo de ropa: " + tipo);
        System.out.println("Precio Actual De Temporada: " + precio + " bs");
        System.out.println("Precio Original: " + precioO + " bs");
    }
}
