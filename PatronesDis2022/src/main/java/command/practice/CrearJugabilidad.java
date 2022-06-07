package command.practice;

import java.util.ArrayList;
import java.util.List;

public class CrearJugabilidad {
    private List <ICommand> commandsIde = new ArrayList<>();

    public CrearJugabilidad(){}

    public void addCommand(ICommand command){
        commandsIde.add(command);
    }

    public void crearJugabilidad(){
        for (ICommand command  : commandsIde) {
            command.execute();
        }
        commandsIde.clear();
    }
}