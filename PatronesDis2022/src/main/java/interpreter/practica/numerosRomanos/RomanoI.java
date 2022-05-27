package interpreter.practica.numerosRomanos;

public class RomanoI extends RomanosT{


    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")){
            context.input= context.input.substring(1);
                if (context.input.startsWith("0")){
                    context.output= context.output+" X";
                    context.input= context.input.substring(1);
                }else{
                    context.output= context.output+" I";
                }
        }

    }
}
