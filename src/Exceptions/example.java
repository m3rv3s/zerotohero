package Exceptions;

import java.io.IOException;

public class example {
    public static void main(String[] args) throws Exception,InterruptedException , IOException {

        WebBrowser webBrowser = new WebBrowser();
        webBrowser.sleep(2);
        webBrowser.readFile("src/Exceptions/myFile.txt");


        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("there is an Exception");
        }
        System.out.println("---------------");
        testNumber(-1);
        System.out.println("Im done with main method ");
    }
    public static void testNumber(int num) throws Exception{
        if (num<0){
            throw new Exception("Number is negative");

        }
        System.out.println("this number is positive ");


    }
}
