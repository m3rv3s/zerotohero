package StaticPractice;

public class StaticReview {


    /*
    *Static instance variable
    * static method
    -to be able to call the static method i dont need to create the object.
    * Static block
     -it will run one time
     - it will run before everything in class
     -to initialize the insatnce variables
     -it is belongs to class
     * instance initialization block
       -instance block belongs to object
        -it will run before every object

      */

    static String name;
    {
        System.out.println("this is intance block");
    }
    static {
        System.out.println("this is static block");
    }
    public static void test(){
        System.out.println(name);
        System.out.println("this is static method");
    }
    public void test1(){
        test();
        System.out.println(name);

    }
    int a;
    int b;

    public static int add(int a , int b){
        return a+b;

    }
    public static int divide(int a , int b){
        return a/b;
    }
    public static int multiply(int a , int b){
        return a*b;
    }
    public static int substract(int a , int b){
        return a-b;
    }
}
