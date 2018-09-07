package ProxyPattern;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
        loadFromDisk(filename);
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading "+ fileName);
    }



    @Override
    public void display() {
        System.out.println("Displaying " + fileName);

    }
}
