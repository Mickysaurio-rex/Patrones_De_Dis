package interpreter.practica.numerosRomanos;



import java.util.ArrayList;
import java.util.List;

public class Interpreter extends RomanosT {
    private List<RomanosT> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter){
        // asegurando que el msg original no tenga espacios - regla gramatica
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "1":
                    grammar.add(new RomanoI());
                    break;
                case "2":
                    grammar.add(new Romano2());
                    break;
                case "3":
                    grammar.add(new Romano3());
                    break;
                case "4":
                    grammar.add(new Romano4());
                    break;
                case "5":
                    grammar.add(new Romano5());
                    break;
                case "6":
                    grammar.add(new Romano6());
                    break;
                case "7":
                    grammar.add(new Romano6());
                    break;
                case "8":
                    grammar.add(new Romano6());
                    break;
                case "9":
                    grammar.add(new Romano6());
                    break;


            }
        }
    }

    public String evaluateMsg(){

        for (RomanosT expression:grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }


}
