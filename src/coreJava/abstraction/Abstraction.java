package coreJava.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        circle.moveTo(7,9);

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
        rectangle.moveTo(9,11);
    }
}
