package Static;

import jdk.dynalink.beans.StaticClass;

public class Book {

    String name;
   //i wanna only store the business book
    String kind;
    //it will be always same author (Jihm Rohn)
    String author;
    int pages;
    int count;
    //instance initialization block
    //we are using this block to initialize our instance variables

    {
        kind="Business Book";
        author="jihm Rohn";
        count++;
        System.out.println("This is instance initialization block");
    }
    /* we are using static block to initialize our instance variables.

     */
        static {
            System.out.println("This is static block. Will be executed one time");

        }

    public Book(String name, int pages){
        this.name=name;
        this.pages=pages;

    }





}
