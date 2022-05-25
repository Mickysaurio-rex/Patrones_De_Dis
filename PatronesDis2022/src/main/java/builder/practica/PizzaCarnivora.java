package builder.practica;

public class PizzaCarnivora extends BuilderPizza{
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("Carne, salsa tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("Masa especial");
    }

    @Override
    public void buildTiposQueso() {
        this.pizza.setTipoQueso("Queso mozarella");

    }

}
