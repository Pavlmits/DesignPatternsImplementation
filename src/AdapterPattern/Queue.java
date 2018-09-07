package AdapterPattern;

public interface Queue<T> {

    void enqueue(T something);
     T dequeue();
}
