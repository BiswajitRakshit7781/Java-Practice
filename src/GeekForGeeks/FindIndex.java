package GeekForGeeks;
import java.util.Scanner;
public class FindIndex {
    static int[] indexfind(int n,int[] arr, int key) {
        int start= -1;
        int end = -1;
        for(int i = 0, j = n-1 ; i < n && j >= 0 ; i++ , j--){
            if(arr[i] == key && start == -1){
                start = i;
            }
            if(arr[j] == key && end == -1){
                end = j;
            }
            if(start != -1 && end != -1 && start != end ){
                break;
            }
        }
        return new int[]{start,end};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the digits to be entered in array : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key to be found : ");
        int key = sc.nextInt();
        int[] indexArr = indexfind(n,arr,key);
        System.out.print("Indexes are : " + indexArr[0] + " & " + indexArr[1]);
    }
}
