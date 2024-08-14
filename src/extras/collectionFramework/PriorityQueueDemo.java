package extras.collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        Queue<Integer> pg = new PriorityQueue<>(Comparator.reverseOrder());

        pg.offer(40);
        pg.offer(12);
        pg.offer(24);
        pg.offer(36);

        System.out.println(pg);

        pg.poll();
        System.out.println(pg);

        System.out.println(pg.peek());
    }
}
