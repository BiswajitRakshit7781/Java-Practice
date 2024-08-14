package extras.collectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(23);
        arrayDeque.offerFirst(12);
        arrayDeque.offerLast(45);
        arrayDeque.offer(26);

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());

        System.out.println(arrayDeque.poll());
        System.out.println("poll() "+arrayDeque);

        System.out.println(arrayDeque.pollFirst());
        System.out.println("pollFirst() "+arrayDeque);

        System.out.println(arrayDeque.pollLast());
        System.out.println("pollLast() "+arrayDeque);
    }
}
