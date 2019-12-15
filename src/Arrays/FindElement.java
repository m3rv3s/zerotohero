package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        String[] colors={"Red" , "Green" , "Black" , "White" , "Orange"};
        //write a program that will ask a user input a color
        //if your color is inside of the array then it will return "inside of array"
        //if your color is not in array it should return -1

        Scanner input=new Scanner(System.in);

        System.out.println("Please write your color:");
        String color=input.next();

        int count=0;

        for (String c:colors){
                if (color.equalsIgnoreCase(c)){
                    System.out.println("your color is inside of array");
                    break;

                }
        count++;
                if (count==colors.length){
                    System.out.println("-1");
                }
        }





        }



    }
