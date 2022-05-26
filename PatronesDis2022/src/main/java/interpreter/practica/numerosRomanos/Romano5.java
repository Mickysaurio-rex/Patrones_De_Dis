package interpreter.practica.numerosRomanos;

public class Romano5 extends RomanosT{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("5")){
            context.output= context.output+" 5";
            context.input= context.input.substring(1);
        }
    }
}
