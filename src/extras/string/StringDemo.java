package extras.string;

public class StringDemo {

    public static void main(String[] args) {

        String a = "Biswa";
        String b = "Biswa";

        System.out.println(a == b);

        String c = new String("Biswa");
        String d = new String("Biswa");

        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println(d.charAt(3));
    }
}
