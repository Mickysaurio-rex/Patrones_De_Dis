package interpreter.practica.numerosRomanos;


public class Client {
    public static void main (String[]args){

        String msg=" 1 2 3 4 5 6 7 8 9 10";

        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
