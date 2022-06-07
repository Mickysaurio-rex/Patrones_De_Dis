package command.practice;


public class Client {
    public static void main (String[]args){
        Juego juego = new Juego();
        juego.setName("Carlos Duty").setPrecio(9.99).setVersion("2022");

        Ataque ataque= new Ataque(juego);
        Disparar disparar = new Disparar(juego);
        Defensa defensa = new Defensa(juego);


        CrearJugabilidad crearJugabilidad= new CrearJugabilidad();

        System.out.println("Iniciando el juego: " + juego.getName());
        crearJugabilidad.addCommand(disparar);
        crearJugabilidad.addCommand(defensa);
        crearJugabilidad.addCommand(ataque);


        crearJugabilidad.crearJugabilidad();
    }

}
