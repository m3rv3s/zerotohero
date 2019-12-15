package Exceptions;

import java.io.IOException;

public class ThrowException {

    public static void main(String[] args)  {
        try {
            System.err.println("i am about to throw an Exception ");
           // System.out.println("i am in try block");
            throw  new IOException();


        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }finally {
            System.out.println("i am finally here");
        }

    }
}
