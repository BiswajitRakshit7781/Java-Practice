package GeekForGeeks;
import java.util.Scanner;
public class DisplayLongestName {
    public static String longest(int n, String[] names) {
        int count = 0;
        String output = "";
        for(int i = 0; i < n ; i++){
            if(count < names[i].length()){
                count = names[i].length();
                output = names[i];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digit to be in array : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names;
        names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the string to be entered in array : ");
            names[i] = sc.nextLine();
        }
        String longestString = longest(n,names);
        System.out.print(longestString);
    }
}
