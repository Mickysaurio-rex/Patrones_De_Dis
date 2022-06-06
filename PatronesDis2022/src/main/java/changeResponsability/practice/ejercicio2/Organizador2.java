package changeResponsability.practice.ejercicio2;

public class Organizador2 implements IOrganizador{

    private IOrganizador next;

    @Override
    public void setNext(IOrganizador handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if(personas.length > 20 && personas.length <= 50){
            int i;
            int aux;
            for (int j = 1; j < personas.length ; j++) {
                aux = personas[j].getEdad();
                i = j-1;
                while(i>=0 && personas[i].getEdad()>aux){   // 9,4,5,12,1
                    personas[i+1] = personas[i];
                    i = i-1;
                }
                personas[i + 1] =  personas[j];
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
