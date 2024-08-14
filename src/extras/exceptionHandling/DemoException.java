package extras.exceptionHandling;

public class DemoException {

    public static void main(String[] args) {

        int i = 5;
        try{
            if (i < 10){
                throw new MyException("Errorrrrr");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
