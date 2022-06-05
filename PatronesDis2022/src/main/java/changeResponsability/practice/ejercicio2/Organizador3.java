package changeResponsability.practice.ejercicio2;

public class Organizador3 implements IOrganizador{

    private IOrganizador next;

    @Override
    public void setNext(IOrganizador handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if(personas.length>50){
            Persona aux;
            for (int i = 0; i < personas.length - 1; i++) {
                for (int j = 0; j < personas.length - i - 1; j++) {
                    if (personas[j + 1].getEdad() < personas[j].getEdad()) {
                        aux = personas[j + 1];
                        personas[j + 1] = personas[j];
                        personas[j] = aux;
                    }
                }
            }
        }else{
            next.criteriaHandler(personas);
        }

    }

    @Override
    public IOrganizador next() {
        return next;
    }
}
