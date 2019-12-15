package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CheckedException {

    public static void main(String[] args) {
        String filePath="src/Exceptions/myFile.txt";
       //filereader is throwing  filenotfoundexception.
        //readline () is throwing IOexception.
        //Throwable --- exception -- IOexception --> filenotfoundexception

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader reader1=new BufferedReader(reader);
            String line=reader1.readLine();
            String line1=reader1.readLine();
            String line3=reader1.readLine();
            System.out.println(line);
            System.out.println(line1);
            System.out.println(line3);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("there is an Exception");

        }catch (IOException e){
            System.out.println("this is IOException");
        }finally {
            System.out.println("I am finally block");
        }

    }
}
