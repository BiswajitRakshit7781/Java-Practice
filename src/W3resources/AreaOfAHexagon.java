//Write a Java program to compute hexagon area.
//Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//where s is the length of a side
//Input Data:
//Input the length of a side of the hexagon: 6
//Expected Output
//
//The area of the hexagon is: 93.53074360871938

package W3resources;

import java.util.Scanner;

public class AreaOfAHexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a Hexagon : ");
        int s = sc.nextInt();
        double area = area(s);
        System.out.print("The area of a Hexagon is : " + area);
    }
    public static double area(int s){
        return (6* Math.pow(s,2))/(4* Math.tan(Math.PI/6));
    }
}
