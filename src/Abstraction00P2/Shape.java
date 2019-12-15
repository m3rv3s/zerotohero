package Abstraction00P2;

public abstract class Shape extends SuperShape {

    String name;
    double area;

    public  Shape(String name){
        this.name=name;
    }
    public  abstract double CalculateArea();

    protected abstract void draw();


@Override
public void superDraw(){
    System.out.println("Im from  shape class");

}
}
