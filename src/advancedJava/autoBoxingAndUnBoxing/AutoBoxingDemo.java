package advancedJava.autoBoxingAndUnBoxing;

class AutoBoxingDemo {

    public static void main(String[] args) {

        int i = 10;

        //autoboxing
        Integer iObj = Integer.valueOf(i);
        System.out.println("Value of Integer obj: "+ iObj);

        //unboxing
        int i1 = iObj;
        System.out.println("Value of i1 : "+i1);

        char x = 'a';
        //autoboxing
        Character charObj = Character.valueOf(x);

        //unboxing
        char ch = charObj;
        System.out.println("Value of ch : "+ch);
        System.out.println("Value of charObj : "+charObj);
    }
}
