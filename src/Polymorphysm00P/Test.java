package Polymorphysm00P;

public class Test {

    public static void main(String[] args) {

        Child child=new Child();
        child.myMethod();
        child.staticMethod();

        System.out.println("------GrandChild---------");
        Child child1=new GrandChild();
        child1.childMethod();
        child1.myMethod();
        child1.staticMethod();

        System.out.println("--------Super------------");

        Super child2=new GrandChild();
        ((Child)child2).childMethod();
        ((Child)child2).staticMethod();
        ((GrandChild)child2).staticMethod();

    }
}
