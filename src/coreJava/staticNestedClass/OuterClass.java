package coreJava.staticNestedClass;

public class OuterClass {
    static int outerStaticMember = 10;
    int instance = 2;
    private static int outerPrivateMember = 30;

    static  class StaticNestedClass{
        void display(){
            System.out.println("Static member of outer class : "+outerStaticMember);
            System.out.println("private static member of outer class : "+outerPrivateMember);
//            System.out.println(instance); //This will throw an error because Static class only access Static variables
        }
    }
}
