package coreJava.staticDemo;

class Student {
    static{
        System.out.println("static initialization");
    }
    int rollNumber;
    String name;
    int age;
    String address;
    static String college ="XYZ";
//    static int count = 0;

    public Student (int rollNumber,String name,int age,String address){
        this.rollNumber = rollNumber;
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
