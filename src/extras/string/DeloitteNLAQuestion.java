package extras.string;

import java.util.Scanner;

public class DeloitteNLAQuestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string= scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length() ; i++){
            char ch = string.charAt(i);
            stringBuilder.append(ch).append(" ");
        }
        stringBuilder.deleteCharAt(string.length()*2-1);
        System.out.println(stringBuilder);
    }
}
