package coreJava.array;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] arg){
        int[] arr;
        arr = new int[5];
        for (int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value :");
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
