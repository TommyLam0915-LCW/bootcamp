package Week5.DataStructure.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Comparator;

public class NaturalOrderStringPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        // Lambda Expression
        Comparator<Integer> descending = (x, y) -> y > x ? 1 : -1; // descending
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(descending);
        priorityQueue2.add(10);
        priorityQueue2.add(100);
        priorityQueue2.add(40);
        for (int i : priorityQueue2) {
            System.out.println(i);
        }
    }
}

