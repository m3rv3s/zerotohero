package HomeWork;

import java.util.Scanner;

public class OilChange2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Please enter year");

        int year=input.nextInt();

        int month=12*year/3;
        int count =1;

        do {
            System.out.println(count+ " times oil change ");
            count++;

        }while(count<=month);
    }
}


