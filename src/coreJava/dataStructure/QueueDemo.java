package coreJava.dataStructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("India");
        queue.add("Germany");
        queue.add("America");
        queue.add("Argentina");
        System.out.println("Original queue : " + queue);
        String head = queue.peek();
        System.out.println("head of the queue : "+head);
        queue.remove();
        System.out.println("After removing : " + queue);
        head= queue.poll();
        System.out.println("Removed head : "+head);
        System.out.println("After removing : " + queue);
    }
}
