package decorator.example;

public class Client {
    public static void main (String []args){

        Ide intelliJIDEA = new IntelliJIdea("community","300mb","2022",10);

        intelliJIDEA= new PlugginTest(intelliJIDEA,15,false);
        intelliJIDEA= new PlugginDebug(intelliJIDEA,0,true);

        intelliJIDEA.showInformation();

        Ide eclipse = new Eclipse("premium","100mb","2022",100);

        eclipse= new PlugginDeploy(eclipse,50,false);
        eclipse= new PlugginDebug(eclipse,150,false);
        eclipse= new PlugginTest(eclipse,250,false);

        eclipse.showInformation();
    }
}
