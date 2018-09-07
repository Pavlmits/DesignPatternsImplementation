import Factory.TCPConnection;
import Factory.TCPConnectionFactory;
import ProxyPattern.Image;
import ProxyPattern.ProxyImage;
import SingletonPattern.InternetConnection;

public class Main {

    public static void main(String[] args) {

            //FACTORY PATTERN
        TCPConnection con = TCPConnectionFactory.getInstance("Windows");
        con.connect();

            //SINGLETON PATTERN
        InternetConnection con2 = InternetConnection.getInstance();
        InternetConnection con3 = InternetConnection.getInstance();

            //PROXY PATTERN
        Image image = new ProxyImage(("arpa.jpg"));
         image.display();
         image.display();
         image.display();

            //

    }
}
