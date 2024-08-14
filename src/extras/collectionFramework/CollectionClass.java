package extras.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
        list.add(12);

        System.out.println("min element :"+ Collections.min(list));
        System.out.println("max element : "+Collections.max(list));
        System.out.println("frequency of 12 "+Collections.frequency(list,12));
        Collections.sort(list);
        System.out.println(list);
    }
}
