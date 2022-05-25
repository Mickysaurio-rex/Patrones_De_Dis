package builder.practica;


public class Owner {
    private BuilderPizza builder;

    public Pizza getPizzaArmada() {
        return builder.getProduct();
    }

    public void setBuilder(BuilderPizza builder) {
        this.builder = builder;
    }

    public void armarPizza(){
        this.builder.createPizza();
        this.builder.buildIngredientes();
        this.builder.buildTipoMasa();
        this.builder.buildTiposQueso();
    }
}