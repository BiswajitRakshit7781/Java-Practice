package coreJava.recursion;

public class ComplexFunction {
    int CalculateFactorial(int n){
        if (n == 1){
            return 1;
        }
        else {
            return (n * CalculateFactorial(n-1));
        }
    }
}
