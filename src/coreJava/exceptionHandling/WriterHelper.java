package coreJava.exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class WriterHelper {
    public void writeList(){
        try{
            List<Integer> list = new ArrayList<>(10);
            list.add(10);

            System.out.println("Entering try statement");
            Integer a = list.get(1);
            System.out.println("Accessing the first element : "+a);

        }catch (IndexOutOfBoundsException e){
            System.err.println("Caught IndexOutOfBoundsException: "+e.getMessage());
        }finally {
            System.out.println("this will always be executed");
        }
    }
}
