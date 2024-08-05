package coreJava.dataStructure;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("D");
        list.addLast("E");
        list.add(2,"F");
        System.out.print(list);
    }
}
