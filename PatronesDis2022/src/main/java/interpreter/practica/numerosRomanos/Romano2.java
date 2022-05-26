package interpreter.practica.numerosRomanos;

public class Romano2 extends RomanosT{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("2")){
            context.output= context.output+" II";
            context.input= context.input.substring(1);
        }

    }
}
