package command.practice;


public class Ataque implements ICommand {
    private Juego juego;

    public Ataque(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("PROCEDIMIENTO ----> ATACANDO");
        juego.disparar();
        juego.atacar();
    }
}
