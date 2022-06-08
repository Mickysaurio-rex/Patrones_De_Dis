package observer.practice;

public class Client {
    public static void main (String [] args){
        Telefonica companiaTelefonica = new Telefonica();
        Persona p1 = new Persona("123", "Miguel");
        Persona p2 = new Persona("124", "Nestor");
        Persona p3 = new Persona("125", "Rebeca");


        companiaTelefonica.realizarUnContrato(new Usuario("Precio Llamadas", p1));
        companiaTelefonica.realizarUnContrato(new Usuario("Premios", p1));


        companiaTelefonica.realizarUnContrato(new Usuario("Promociones", p2));
        companiaTelefonica.realizarUnContrato(new Usuario("Premios", p2));

        // Ejemplo3
        companiaTelefonica.realizarUnContrato(new Usuario("Precio Llamadas", p3));
        companiaTelefonica.realizarUnContrato(new Usuario("Premios", p3));
        companiaTelefonica.realizarUnContrato(new Usuario("Promociones", p3));
        companiaTelefonica.realizarUnContrato(new Usuario("Noticias", p3));


        companiaTelefonica.sendPromocion(new Promocion("Carguita Feliz",
                "Promociones"));
        companiaTelefonica.sendPromocion(new Promocion("Usted recibio 50 bs",
                "Premios"));
        companiaTelefonica.sendPromocion(new Promocion("Su ultima llamda fue de 0,50 ctvs",
                "Precio Llamadas"));
        companiaTelefonica.sendPromocion(new Promocion("Se cayo su casa",
                "Noticias"));
    }
}
