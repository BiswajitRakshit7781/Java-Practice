package extras.string;

public class Performance {

    public static void main(String[] args) {

        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
//            System.out.println(ch);
            series.append(" ").append(ch);
        }
        System.out.println(series);
    }
}
