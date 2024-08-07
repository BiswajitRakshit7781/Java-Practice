package extras.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter a number : ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println("The number is : "+number);

        bufferedReader.close();
    }
}
