package builder.practica;

public class Client {
    public static void main(String[] args) {
        Owner nestor = new Owner();
        BuilderPizza pizza1 = new PizzaCarnivora();
        BuilderPizza pizza2 = new PizzaClasica();
        BuilderPizza pizza3 = new PizzaHawaina();

        nestor.setBuilder(pizza1);
        nestor.armarPizza();
        Pizza pzz1 = nestor.getPizzaArmada();
        System.out.println("************Pizza Carnivora************");
        pzz1.showInfo();

        nestor.setBuilder(pizza2);
        nestor.armarPizza();
        Pizza pzz2 = nestor.getPizzaArmada();
        System.out.println("************Pizza Clasica************");
        pzz2.showInfo();

        nestor.setBuilder(pizza3);
        nestor.armarPizza();
        Pizza pzz3 = nestor.getPizzaArmada();
        System.out.println("************Pizza Hawaina************");
        pzz3.showInfo();
    }
}
