package Factory;



public class TCPWindows implements TCPConnection {


    @Override
    public void connect() {
        System.out.println("Windows Connecting...");
    }
}
