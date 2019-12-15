package Polymorphysm00P;

public class GrandChild extends Child {

    @Override
    public void childMethod(){
        System.out.println("I am child method in GrandChild class");
    }

    public static void staticMethod(){
        System.out.println("i am static method in grandchild class");
    }
}
