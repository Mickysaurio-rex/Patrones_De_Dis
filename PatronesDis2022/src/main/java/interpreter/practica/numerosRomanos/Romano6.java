package interpreter.practica.numerosRomanos;

public class Romano6 extends RomanosT{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("6")){
            context.output= context.output+" VI";
            context.input= context.input.substring(1);
        }

    }
}
