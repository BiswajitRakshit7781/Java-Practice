package GeekForGeeks;

import java.util.Scanner;

public class AverageInAStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the digits of array : ");
            arr[i] = sc.nextInt();
        }
        float[] avg = avgStream(n,arr);
        System.out.print("Average of the stream are : ");
        for(float i : avg){
            System.out.print(i + " ");
        }
    }
    public static float[] avgStream(int n,int[] arr){
        float[] store = new float[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            store[i] = sum/(i+1);
        }
        return store;
    }
}
