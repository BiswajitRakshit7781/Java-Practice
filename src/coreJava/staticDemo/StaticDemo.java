package coreJava.staticDemo;

public class StaticDemo {
    public static void main(String[] args) {
        Student john = new Student(1,"John",25,"East California");
        System.out.println(john.rollNumber);
        System.out.println(john.name);
        System.out.println(john.age);
        System.out.println(john.address);
        System.out.println(Student.college);
    }
}
