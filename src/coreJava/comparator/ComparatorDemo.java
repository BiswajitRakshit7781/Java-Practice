package coreJava.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student john = new Student(3,"John",26,"New York");
        Student jane = new Student(2,"Jane",22,"America");
        Student tom = new Student(1,"Tom",28,"Tokyo");

        list.add(john);
        list.add(jane);
        list.add(tom);

        Collections.sort(list);
        System.out.println("Student after natural listing : ");
        list.forEach(student -> System.out.println(student.getRollNumber()+" "+ student.getName()+" "+ student.getAge()+" "+ student.getAddress()));

        Collections.sort(list, new AgeComparator());
        System.out.println("Student after age listing : ");
        list.forEach(student -> System.out.println(student.getRollNumber()+" "+ student.getName()+" "+ student.getAge()+" "+ student.getAddress()));
    }
}
