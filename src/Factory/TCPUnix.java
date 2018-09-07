package Factory;


public class TCPUnix implements TCPConnection {


    @Override
    public void connect() {
        System.out.println("Unix Connecting...");
    }
}
