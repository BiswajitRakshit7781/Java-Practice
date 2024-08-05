//Write a Java program and compute the sum of an integer's digits.
//Input Data:
//Input an integer: 25
//Expected Output
//
//The sum of the digits is: 7

package W3resources;

import java.util.Scanner;

public class SumOfIntegarDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int n = sc.nextInt();
        int sum = 0;
        int reminder;
        while(n > 0){
            reminder = n % 10 ;
            n = n / 10;
            sum = sum + reminder;
        }
        System.out.print("The sum is : " + sum);
    }
}
