package coreJava.equalsAndHashCode;

public class EqualAndHashCode {
    public static void main(String[] args) {
        Student john = new Student(1,"John",21, "California");
        Student john2 = new Student(2,"John",21, "California");

        System.out.println(john.equals(john2));

        int hashValue = john2.hashcode();
        System.out.println(hashValue);
    }
}