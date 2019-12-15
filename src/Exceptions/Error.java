package Exceptions;

public class Error {

    public static void myMethod(){

        //we must not handle errors
        // this is stackOverFlowError

        System.out.println("I am inside of my method");

        myMethod();
    }

    public static void main(String[] args) {
        myMethod();
    }
}
