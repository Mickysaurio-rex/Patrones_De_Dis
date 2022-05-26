package interpreter.practica.numerosRomanos;

public class Romano3 extends RomanosT{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output= context.output+" III";
            context.input= context.input.substring(1);
        }
    }
}
