package builder.practica;

public class PizzaHawaina extends BuilderPizza{
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Pina, salsa tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa normal");
    }

    @Override
    public void buildTiposQueso() {
        this.pizza.setTipoQueso("Queso mozarella tipo 2");

    }
}
