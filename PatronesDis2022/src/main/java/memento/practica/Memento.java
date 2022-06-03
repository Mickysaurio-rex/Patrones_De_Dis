package memento.practica;

import java.util.List;

public class Memento {
    private List<Persona> state;

    public Memento(List<Persona> listaPersonas){
        state = listaPersonas;
    }

    public List<Persona> getState() {
        return state;
    }
}
