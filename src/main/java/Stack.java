public class Stack<T> {

    int maxSize;
    Object[] arr;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new Object[maxSize];
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
