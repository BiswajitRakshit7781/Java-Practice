package extras.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator "+ it.next());
        }
    }
}
