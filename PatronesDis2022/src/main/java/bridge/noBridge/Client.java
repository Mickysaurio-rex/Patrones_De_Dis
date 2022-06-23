package bridge.noBridge;

public class Client {

    public static void main(String[]args){
        Windows windows = new Windows();
        Linux linux = new Linux();

        windows.crearSistema();
        windows.arqui64();
        windows.arqui86();

        linux.crearSistema();
        linux.arqui64();
        linux.arqui86();


    }




}
