package src;

import java.util.LinkedList;
import java.util.Queue;

public class BootCampQueue<T> {
    private Queue<T> data;

    public BootCampQueue() {
        this.data = new LinkedList<>();
    }

    public void add(T element) {
        this.data.offer(element);
    }

    public T poll() {
        return this.data.poll();
    }

    public static void main(String[] args) {
        BootCampQueue<String> bq = new BootCampQueue<>();
        bq.add("hello");
        bq.add("world");

        System.out.println(bq.poll()); // Output: hello
        System.out.println(bq.poll()); // Output: world
    }
}
