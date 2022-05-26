package interpreter.practica.numerosRomanos;

public class Romano9 extends RomanosT{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("9")){
            context.output= context.output+" IX";
            context.input= context.input.substring(1);
        }

    }
}
