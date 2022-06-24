package composite;

public class Client {
        public static void main(String[] args){
            CompositeCompu lab1 = new CompositeCompu("Laboratorio1");
            lab1.add(new Computadora("Computadora1").setPrecio(100));
            lab1.add(new Computadora("Computadora2").setPrecio(100));
            lab1.add(new Computadora("Computadora3").setPrecio(100));

            CompositeCompu lab2 = new CompositeCompu("Laboratorio2");
            lab2.add(new Computadora("Computadora4").setPrecio(100));
            lab2.add(new Computadora("Computadora5").setPrecio(100));
            lab2.add(new Computadora("Computadora6").setPrecio(100));
            lab2.add(new Computadora("Computadora7").setPrecio(100));

            CompositeCompu cont1 = new CompositeCompu("Contenedor1");
            cont1.add(lab1);
            cont1.add(lab2);

            cont1.mostrarDetalles();
        }
}

