package mediator.practice;


public class Client {
    public static void main(String[] args) {
        Skype skype = new Skype();

        Sm sm1 = new Sm(skype);
        sm1.setCargo("SM").setCi("123").setName("jose1");
        sm1.setCertificaciones("A1");
        Sm sm2 = new Sm(skype);
        sm2.setCargo("SM").setCi("1234").setName("jose2");
        sm2.setCertificaciones("A2");
        Sm sm3 = new Sm(skype);
        sm3.setCargo("SM").setCi("12345").setName("jose3");
        sm3.setCertificaciones("A3");

        Dev dev1 = new Dev(skype);
        dev1.setCargo("DEV").setCi("4444").setName("maria1");
        dev1.setLenguaje("Espanol");
        Dev dev2 = new Dev(skype);
        dev2.setCargo("DEV").setCi("5555").setName("maria2");
        dev2.setLenguaje("Ingles");
        Dev dev3 = new Dev(skype);
        dev3.setCargo("DEV").setCi("6666").setName("maria3");
        dev3.setLenguaje("Frances");

        Qa qa1 = new Qa(skype);
        qa1.setCargo("QA").setCi("909").setName("ana1");
        qa1.setGrado("Basico");
        Qa qa2 = new Qa(skype);
        qa2.setCargo("QA").setCi("919").setName("ana2");
        qa2.setGrado("Intermedio");
        Qa qa3 = new Qa(skype);
        qa3.setCargo("QA").setCi("929").setName("ana3");
        qa3.setGrado("Avanzado");

        skype.agregarIntegrantes(sm1,"SM").
                agregarIntegrantes(sm2,"SM").
                agregarIntegrantes(sm3,"SM").
                agregarIntegrantes(dev1, "DEV").
                agregarIntegrantes(dev2, "DEV").
                agregarIntegrantes(dev3, "DEV").
                agregarIntegrantes(qa1,"QA").
                agregarIntegrantes(qa2,"QA").
                agregarIntegrantes(qa3,"QA");

        sm1.send("Para todos");
        qa2.send("Solo QA");
        dev3.send("Solo DEV");

    }
}