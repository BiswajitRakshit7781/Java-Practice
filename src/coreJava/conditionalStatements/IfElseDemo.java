package coreJava.conditionalStatements;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age<13){
            System.out.print("You are a kid");
        } else if (age<20) {
            System.out.print("You are a teenager");
        }
        else{
            System.out.print("You are an adult");
        }
    }
}
