package coreJava.conditionalStatements;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.print("Enter the date in digit : ");
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        String day;
        switch (date) {
            case 1:
                day = "Mon";
                break;
            case 2:
                day = "Tues";
                break;
            case 3:
                day = "Wednes";
                break;
            case 4:
                day="Thurs";
                break;
            case 5:
                day="Fri";
                break;
            case 6:
                day = "Satur";
                break;
            case 7:
                day = "Sun";
                break;
            default:
                day = "invalid";
                break;
        }
        System.out.print("The day is : " + day + "day");
    }
}
