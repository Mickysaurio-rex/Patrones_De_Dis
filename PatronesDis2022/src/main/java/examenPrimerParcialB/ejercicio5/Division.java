package examenPrimerParcialB.ejercicio5;

public class Division extends OperationM {
    public Division(int digit) {
        this.digit = digit;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("/")){
            context.signo = 3;
            context.input = context.input.substring(this.digit);
        }
    }
}
