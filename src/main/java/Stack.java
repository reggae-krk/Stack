import java.lang.reflect.Array;

public class Stack<T> {

    private final int maxSize;
    private final T[] arr;

    public Stack(Class<T> type, int maxSize) {
        this.maxSize = maxSize;
        this.arr = (T[]) Array.newInstance(type, maxSize);
    }

    public int spaceLeft() {
        int counter = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] != null) counter++;
        }
        return maxSize - counter;
    }

    public void push(T obj) {
        if(spaceLeft() < 0) {
            int indexToPush = this.maxSize - spaceLeft();
            this.arr[indexToPush] = obj;
        }
    }
}
