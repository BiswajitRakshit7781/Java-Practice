package coreJava.dataStructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("India");
        stack.push("America");
        stack.push("Germany");
        stack.push("Argentina");
        System.out.println("Stack is : " + stack);
        int location = stack.search("India");
        System.out.println("Location of \"India\" is : " + location);
        String topElement = stack.peek();
        System.out.println("Top element : "+ topElement);
        String poppedElement = stack.pop();
        System.out.println("Popped element : "+poppedElement);
        topElement = stack.peek();
        System.out.println("Top element : "+ topElement);
        System.out.println("Nowthe Stack is : " + stack);
    }
}