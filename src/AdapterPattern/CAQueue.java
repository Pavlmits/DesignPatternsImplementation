package AdapterPattern;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class CAQueue<T> extends LinkedList implements Queue{


    @Override
    public void enqueue(Object something) {
      super.add(something);
    }

    @Override
    public Object dequeue() {
        return super.remove(size()-1);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
