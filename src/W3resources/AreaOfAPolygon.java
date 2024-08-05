//Write a Java program to compute the area of a polygon.
//Area of a polygon = (n*s^2)/(4*tan(π/n))
//where n is n-sided polygon and s is the length of a side
//Input Data:
//Input the number of sides on the polygon: 7
//Input the length of one of the sides: 6
//Expected Output
//
//The area is: 130.82084798405722

package W3resources;

import java.util.Scanner;

public class AreaOfAPolygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of sides of polygon : ");
        int n = sc.nextInt();
        System.out.print("Input the length of one of the sides : ");
        int s = sc.nextInt();
        double area = area(n,s);
        System.out.print("The area is : " + area);
    }
    public static double area(int n, int s){
        return (n* Math.pow(s,2))/(4* Math.tan(Math.PI/n));
    }
}
