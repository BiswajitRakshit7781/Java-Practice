package coreJava.dataStructure;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("X");
        treeSet.add("M");
        treeSet.add("Q");
        treeSet.add("A");
        treeSet.add("Z");
        treeSet.add("D");
        for( String i : treeSet){
            System.out.println(i + " ");
        }
        System.out.print(treeSet);
    }
}
