package examenPrimerParcialB.ejercicio5;


public class Addition extends OperationM {

    public Addition(int digit){
        this.digit=digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")){
            context.signo=2;
            context.input=context.input.substring(this.digit);
        }

    }
}