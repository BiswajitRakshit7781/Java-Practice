package GeekForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the digits of array : ");
            arr[i] = sc.nextInt();
        }
        if (isPerfect(n,arr)){
            System.out.print("Perfect");
        }
        else{
            System.out.print("Not Perfect");
        }
    }
    public static boolean isPerfect(int n,int[] arr){
        int[] revArr = new int[n];
        for (int i = 0; i < n; i++) {
            revArr[n-i-1] = arr[i];
        }
        return Arrays.equals(revArr,arr);
    }
}
