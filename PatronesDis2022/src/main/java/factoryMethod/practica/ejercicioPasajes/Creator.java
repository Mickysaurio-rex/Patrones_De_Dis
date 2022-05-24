package factoryMethod.practica.ejercicioPasajes;


public abstract class Creator {
    public Creator(){}
    public abstract IPasaje createProduct(Pasajero persona);
}