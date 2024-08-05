//Write a Java program to compute the distance between two points on the earth's surface.
//Distance between the two points [ (x1,y1) & (x2,y2)]
//d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//Radius of the earth r = 6371.01 Kilometers
//Input Data:
//Input the latitude of coordinate 1: 25
//Input the longitude of coordinate 1: 35
//Input the latitude of coordinate 2: 35.5
//Input the longitude of coordinate 2: 25.5
//Expected Output
//
//The distance between those points is: 1480.0848451069087 km

package W3resources;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        float lat1 = sc.nextFloat();
        System.out.print("Input the longitude of coordinate 1: ");
        float long1 = sc.nextFloat();
        System.out.print("Input the latitude of coordinate 2: ");
        float lat2 = sc.nextFloat();
        System.out.print("Input the longitude coordinate 2: ");
        float long2 = sc.nextFloat();
        double earthRadius = 6371.01;
        double x1 = Math.toRadians(lat1);
        double x2 = Math.toRadians(lat2);
        double y1 = Math.toRadians(long1);
        double y2 = Math.toRadians(long2);
        double distance = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        System.out.println(distance);
    }
}
