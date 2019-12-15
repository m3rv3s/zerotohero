package Practice;

import java.util.Scanner;

public class FactorialPractice1 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter a number");
        int number=input.nextInt();
        int factorial=1;

        for (int i=number;i>=1;i--){


            factorial=factorial*i;


        }
        System.out.println(factorial);

    }




}
