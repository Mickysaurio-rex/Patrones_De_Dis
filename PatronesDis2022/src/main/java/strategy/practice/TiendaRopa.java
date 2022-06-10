package strategy.practice;

import java.util.ArrayList;
import java.util.List;

public class TiendaRopa {
    private String nombre;
    private List<Ropa> ropaList = new ArrayList<>();
    private IEstacion estacion;

    public TiendaRopa(String nombre) {
        this.nombre = nombre;
    }

    public void addRopa(Ropa ropa){
        ropaList.add(ropa);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ropa> getRopaList() {
        return ropaList;
    }

    public void setRopaList(List<Ropa> ropaList) {
        this.ropaList = ropaList;
    }

    public IEstacion getEstacion() {
        return estacion;
    }

    public void setEstacion(IEstacion estacion) {
        this.estacion = estacion;
    }

    public void cambiarTemporada(){
        estacion.estrategiaVentas(ropaList);
    }
}
