package Abstraction00P2;

public class TestShape {

    public static void main(String[] args) {

        Triangle triangle=new Triangle("Triangle");
        triangle.height=5;
        triangle.width=6;
      //  System.out.println(triangle.calculateArea());
        triangle.draw();


        System.out.println("--------------------------");
        Circle circle=new Circle("Circle");
        circle.radius=10;
     //   System.out.println(circle.());
        circle.draw();

        }
    }

