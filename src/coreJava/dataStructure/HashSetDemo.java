package coreJava.dataStructure;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println(set);
        System.out.println("Does the set contains 'C': " + set.contains("C"));
        set.remove("E");
        System.out.println("After removing 'E': " + set);
    }
}
