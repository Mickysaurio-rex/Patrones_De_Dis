package interpreter.practica.numerosRomanos;

public class Romano7 extends RomanosT{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("7")){
            context.output= context.output+" VII";
            context.input= context.input.substring(1);
        }
    }
}
