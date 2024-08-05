package coreJava.comparable;

class Student implements Comparable<Student> {
    private final int rollNumber;
    private final String name;
    private final int age;
    private final String address;

    public Student(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int compareTo(Student student){
        return this.rollNumber - student.rollNumber;
    }
}
