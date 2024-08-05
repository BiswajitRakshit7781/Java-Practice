package coreJava.recursion;

public class Factorial {
    public static void main(String[] args) {
        ComplexFunction fact = new ComplexFunction();
        int result = fact.CalculateFactorial(5);
        System.out.println("Factorial of 5 is : "+result);
    }
}
