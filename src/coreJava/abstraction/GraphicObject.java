package coreJava.abstraction;

public abstract class GraphicObject {
    int x,y;
    void moveTo(int newX,int newY){
        this.x = newX;
        this.y = newY;
        System.out.println(("move to x : "+x+" and y : "+y));
    }
    abstract void draw();
    abstract void resize();
}