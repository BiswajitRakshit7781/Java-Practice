package advancedJava.serialization;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String name;
    private final int age;
    private final String address;

    transient int x;

    public Student(String name,int age,String address){
        this.name =name;
        this.age =age;
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

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public String toString() {
        return ("Student name : "+ this.getName() +", Age is : " + this.getAge() + " and the address is : "+this.getAddress()+"\nValue of X is : "+this.getX());
    }
}
