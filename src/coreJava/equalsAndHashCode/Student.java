package coreJava.equalsAndHashCode;

class Student {
    static{
        System.out.println("static initialization");
    }
    int rollNumber;
    String name;
    int age;
    String address;
//    static int count = 0;

    public Student (int rollNumber,String name,int age,String address){
        this.rollNumber = rollNumber;
        this.name=name;
        this.age=age;
        this.address=address;
    }
//    static void studentCount(){
//        count += 1;
//    }

//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Student student = (Student) obj;
        return (student.rollNumber == this.rollNumber);
    }

    public int hashcode(){
        return this.rollNumber;
    }
}
