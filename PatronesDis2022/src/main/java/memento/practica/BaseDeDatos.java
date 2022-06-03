package memento.practica;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {
    private Map<String, Memento> backups= new HashMap<>();

    public void createBackup(String backup,Memento m){
        backups.put(backup,m);
    }

    public Memento getBackup(String backup){
        return backups.get(backup);
    }
}
