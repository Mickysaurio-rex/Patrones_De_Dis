package command.practice;


public class Defensa implements ICommand {
    private Juego juego;

    public Defensa(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("PROCEDIMIENTO ----> DEFENDIENDOSE");
        juego.modoDefensa();
    }
}
