package DoWhileLoop;

import java.util.Scanner;

public class PrintTree {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
        int number = 5;
        String star = "*";
       // System.out.println("please enter the number");
       // int num=input.nextInt();


        //if you give letter instead of int it will give you a run time error. InputMismatchException

        do {
            System.out.println(star);
            star+=star+"*";
            number--;

        }while(number>=0);

    }

}