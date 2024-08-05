package coreJava.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
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
        list.forEach(studente -> System.out.println(studente.getRollNumber()+" "+ studente.getName()+" "+ studente.getAge()+" "+ studente.getAddress()));
    }
}
