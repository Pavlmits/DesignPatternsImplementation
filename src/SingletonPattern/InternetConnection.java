package SingletonPattern;

public class InternetConnection {

    private static InternetConnection connection = null;

    private InternetConnection() {

    }

    public static InternetConnection getInstance()
    {
        if(connection == null)
        {
            connection = new InternetConnection();
        }
        else{
            System.out.println("Device is  already connected ");
        }
        return connection;
    }


}
