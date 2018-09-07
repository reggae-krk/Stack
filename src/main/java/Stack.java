public class Stack<T> {

    int maxSize;
    Object[] arr;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new Object[maxSize];
    }
}
