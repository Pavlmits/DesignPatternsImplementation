package Factory;

public class TCPConnectionFactory {

    public static TCPConnection getInstance(String type)
    {

        if(type.equals("Windows"))
        {
           return new TCPWindows();
        }
        else if(type.equals("Unix"))
        {
            return new TCPUnix();
        }
        return  null;
    }

}
