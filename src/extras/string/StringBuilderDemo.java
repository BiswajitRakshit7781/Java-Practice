package extras.string;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(" ").append(ch);
        }
        System.out.println(builder);
    }
}
