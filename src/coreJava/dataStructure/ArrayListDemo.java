package coreJava.dataStructure;

public class ArrayListDemo {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arraylist = new java.util.ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            arraylist.add(i);
        }
        System.out.println(arraylist+ " ");
        arraylist.remove(2);
        System.out.println(arraylist+ " ");
        System.out.println(arraylist.size());
        System.out.print(arraylist.get(3));
    }
}
