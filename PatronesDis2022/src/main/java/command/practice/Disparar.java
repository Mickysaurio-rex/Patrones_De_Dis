package command.practice;


public class Disparar implements ICommand {
    private Juego juego;

    public Disparar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("PROCEDIMIENTO ----> DISPARANDO");
        juego.disparar();
        System.out.println("No le di, soy manco");
    }
}
