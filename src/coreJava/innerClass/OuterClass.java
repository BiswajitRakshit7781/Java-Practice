package coreJava.innerClass;

public class OuterClass {
    class InnerClass{
        public void display(){
            System.out.println("This is an inner class method");
        }
    }

    void OuterClassMethod(){
        System.out.println("It is the outer class method");
        class MethodLocalClass{
            void InnerLocalMethod(){
                System.out.println("In the method local class method");
            }
        }
        MethodLocalClass mlc = new MethodLocalClass();
        mlc.InnerLocalMethod();
    }
}
