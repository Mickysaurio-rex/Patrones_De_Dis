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
            for (int i = 0; i < personas.length - 1; i++)
            {
                int min = i;
                for (int j = i + 1; j < personas.length; j++)
                {
                    if (personas[j].getEdad() < personas[min].getEdad())
                    {
                        min = j;
                    }
                }
                if (i != min)
                {
                    Persona aux= personas[i];
                    personas[i] = personas[min];
                    personas[min] = aux;
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
