package memento.practica;


import java.util.List;

public class Actualizador {
    private List<Persona> state;

    public void setBackup(List<Persona> state){
        this.state=state;
    }

    public Memento createBackup(){
        return new Memento(state);
    }

    public List<Persona> restoreBackup(Memento m){
        this.state= m.getState();
        return this.state;
    }
}
