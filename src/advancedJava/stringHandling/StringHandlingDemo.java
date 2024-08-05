package advancedJava.stringHandling;

import java.util.Arrays;

public class StringHandlingDemo {

    public static void main(String[] args) {
        String str1 = "John is studying ";
        String str2 = "in college";

        System.out.println(str1.length());

        String result = str1.concat(str2);
        System.out.println(result);

        String r = String.format("The name of the student is " + "%s, and the age is " + "variable is %d ", "John",21);
        System.out.println(r);

        System.out.println(str1.charAt(5));

        if(str1.equals(str2)){
            System.out.println("Both strings are same");
        } else {
            System.out.println("Both strings are different");
        }

        System.out.println(str1.indexOf('y'));

        System.out.println(str1.replace('J','D'));

        String[] arr = str1.split(" ");
        Arrays.asList(arr).forEach(System.out::println);

        String newStr = str1.substring(1,5);
        System.out.println(newStr);
    }
}
