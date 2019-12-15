package Practice;

import java.util.Scanner;

public class PrintingNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number");
        int number = input.nextInt();

        if (number <= 40 && number > 18) {   //number>=10
            System.out.println(number + " it is in the range");

//        }else{
//            System.out.println(number+" it is not in the range");
//        }

            for (int i = number; i <= 40; i++ ) {

                System.out.println(i + " you can enter");
            }


        } else {
            System.out.println(number + " it is not in the range");


            // TO BE ABLE TO TEST - you need to cover all this conditions
            // the number is in the range that are in between 19-40
            // the number is not in the range if its not in between
            // upper limit is 40 lower limit is 19

        }


















    }}
