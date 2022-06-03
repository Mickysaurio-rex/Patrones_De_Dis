package memento.practica;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        Actualizador backups = new Actualizador();

        List<Persona> lista1 = new ArrayList<>();
        lista1.add(new Persona("Maria", "123", 15));
        lista1.add(new Persona("Nestor", "1234", 17));
        backups.setBackup(lista1);
        baseDeDatos.createBackup("BackupEnero", backups.createBackup());

        List<Persona> lista2 = new ArrayList<>();
        lista2.add(new Persona("Maria", "123", 15));
        lista2.add(new Persona("Nestor", "1234", 17));
        lista2.add(new Persona("Luis", "12345", 13));
        backups.setBackup(lista2);
        baseDeDatos.createBackup("BackupFebrero", backups.createBackup());

        List<Persona> lista3 = new ArrayList<>();
        lista3.add(new Persona("Maria", "123", 15));
        lista3.add(new Persona("Nestor", "1234", 17));
        lista3.add(new Persona("Luis", "12345", 13));
        lista3.add(new Persona("Camila", "123456", 18));
        lista3.add(new Persona("Rebeca", "4321", 16));
        backups.setBackup(lista3);
        baseDeDatos.createBackup("BackupMarzo", backups.createBackup());


        List<Persona> lista4 = new ArrayList<>();
        lista4.add(new Persona("Maria", "123", 15));
        lista4.add(new Persona("Nestor", "1234", 17));
        lista4.add(new Persona("Luis", "12345", 13));
        lista4.add(new Persona("Camila", "123456", 18));
        lista4.add(new Persona("Rebeca", "4321", 16));
        backups.setBackup(lista4);
        baseDeDatos.createBackup("BackupAbril", backups.createBackup());


        List<Persona> lista5 = new ArrayList<>();
        lista5.add(new Persona("Maria", "123", 15));
        lista5.add(new Persona("Nestor", "1234", 17));
        lista5.add(new Persona("Luis", "12345", 13));
        lista5.add(new Persona("Camila", "123456", 18));
        lista5.add(new Persona("Rebeca", "4321", 16));
        lista5.add(new Persona("Miguel", "54321", 19));
        backups.setBackup(lista5);
        baseDeDatos.createBackup("BackupMayo", backups.createBackup());

        List<Persona> listaBackup = backups.restoreBackup(baseDeDatos.getBackup("BackupMarzo"));
        for (Persona p : listaBackup) {
            p.showInfo();
        }
    }
}
