package HomeWork;

import java.util.Scanner;

public class PracticeNumber4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       // int num1,num2,switch,total=0;

        System.out.println("Please enter 1st number");
       int  num1=input.nextInt();

       System.out.println("Please Enter 2nd number");
       int  num2=input.nextInt();

       int sum=0;

       while(num1<=num2){
            System.out.println(num1);
            sum=sum+num1;
            num1++;

        }
        System.out.println("Total="+sum);

    }
}

//Debugging . it is very very important.

