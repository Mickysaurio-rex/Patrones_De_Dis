package mediator.practice;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion{

    Map<Persona,String> profesionalChat = new HashMap<Persona,String>();

    public Skype agregarIntegrantes(Persona persona, String cargo){
        profesionalChat.put(persona,cargo);
        return this;
    }
    @Override
    public void send(String msg, Persona persona) {
        Persona emisor = persona;
        Qa integranteQa;
        Dev integranteDev;
        Sm integranteSm;
        for (Map.Entry<Persona,String> integrante: profesionalChat.entrySet()){
            if(!emisor.getCi().equals(integrante.getKey().getCi())){
                if(emisor.getCargo().equals("QA") && integrante.getValue().equals("QA")){
                    integranteQa = (Qa) integrante.getKey();
                    System.out.print("El proesfional QA --> ");
                    integranteQa.received(msg);
                }else if(emisor.getCargo().equals("DEV") && integrante.getValue().equals("DEV")){
                    integranteDev = (Dev) integrante.getKey();
                    System.out.print("El proesfional DEV --> ");
                    integranteDev.received(msg);
                }else if(emisor.getCargo().equals("SM")){
                    if(integrante.getValue().equals("QA")){
                        integranteQa = (Qa) integrante.getKey();
                        System.out.print("El proesfional QA --> ");
                        integranteQa.received(msg);
                    }else if(integrante.getValue().equals("DEV")){
                        integranteDev = (Dev) integrante.getKey();
                        System.out.print("El proesfional DEV --> ");
                        integranteDev.received(msg);
                    }else{
                        integranteSm = (Sm) integrante.getKey();
                        System.out.print("El proesfional SM --> ");
                        integranteSm.received(msg);
                    }
                }
            }
        }
    }
}
