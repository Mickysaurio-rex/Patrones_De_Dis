package observer.practice;

public class Usuario implements IUser{
    String tipo;
    Persona persona;

    public Usuario(String tipo, Persona persona) {
        this.tipo = tipo;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Promocion newPromocion) {
        System.out.println("***** " + msg + " *****");
        System.out.println("Categoria de preferencia  --> " + tipo);
        System.out.println("Cliente --> " + persona.getName());
        newPromocion.showInfo();
    }


    @Override
    public String getPreferenciaPromocion() {
        return tipo;
    }
}
