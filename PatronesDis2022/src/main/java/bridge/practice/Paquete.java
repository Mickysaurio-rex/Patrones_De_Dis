package bridge.practice;

public class Paquete {
    private String name;
    private double precio;

    public Paquete(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar(){
        System.out.println("*****************************" );
        System.out.println("Nombre del paquete: " + name);
        System.out.println("Su precio es de: " + precio);
        System.out.println("*****************************" );
    }
}
