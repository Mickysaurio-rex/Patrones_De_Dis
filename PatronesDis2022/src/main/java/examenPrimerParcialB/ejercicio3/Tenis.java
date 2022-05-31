package examenPrimerParcialB.ejercicio3;

public class Tenis implements IProductosDeportivos{
    public String nombre;
    public int costo;
    public String tamano;
    public String color;
    public boolean garantia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    @Override
    public void showInfo() {
        System.out.println("**********************");
        System.out.println("Producto: " + nombre);
        System.out.println("Costo: " + costo);
        System.out.println("Tamano: " + tamano);
        System.out.println("Color: " + color);
        System.out.println("Garantia: " + garantia);
        System.out.println("**********************");
    }
}
