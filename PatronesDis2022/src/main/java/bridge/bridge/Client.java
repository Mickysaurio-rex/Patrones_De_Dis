package bridge.bridge;

public class Client {
    public static void main(String[]args){
        Windows windows = new Windows(new x86());
        Windows windows2 = new Windows(new x64());
        Linux linux = new Linux(new x86());
        Linux linux2 = new Linux(new x64());

        windows2.arqui();
        windows.arqui();
        linux.arqui();
        linux2.arqui();
    }
}
