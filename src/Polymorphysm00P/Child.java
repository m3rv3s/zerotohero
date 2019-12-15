package Polymorphysm00P;

public class Child extends Super {

    @Override
    public void myMethod(){
        System.out.println("I am inside of child class");
    }
    public static void staticMethod(){
        System.out.println(" I am static method from Child class");
    }
    public void childMethod(){
        System.out.println("i am child method  from child class");
    }
}
