package extras.string;

public class PalindromString {

    public static void main(String[] args) {
        String str = "abcdcba";
        if(isPalindrome(str)){
            System.out.println("The string is a palindrome string");
        } else{
            System.out.println("the string is not a palindrome string");
        }
    }

    static boolean isPalindrome(String str){
        if (str == null || str.isEmpty()){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end){
                return false;
            }
        }
        return true;
    }
}
