package builder.practica;

public class PizzaClasica extends BuilderPizza{
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Salsa tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa especial");
    }

    @Override
    public void buildTiposQueso() {
        this.pizza.setTipoQueso("Doble queso mozarella tipo 2");

    }
}
