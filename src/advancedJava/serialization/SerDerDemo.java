package advancedJava.serialization;

import java.io.*;

public class SerDerDemo {

    public static void main(String[] args) {
        Student student = new Student("John",25,"California");
        student.setX(5);

        String filename = "C:\\Biswajit Rakshit\\Test.txt";
        FileOutputStream fileOut;
        ObjectOutputStream objOut;

        try{
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized : \n"+student);
        } catch (IOException ex){
            System.out.println("IOException is caught");
        }

        FileInputStream fileIn;
        ObjectInputStream objIn;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deserialized : \n"+object);

            objIn.close();
            fileIn.close();
        } catch (IOException ex){
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
