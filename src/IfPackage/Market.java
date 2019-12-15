package IfPackage;

import java.util.Scanner;

public class Market {

    //shopping
    //everything total will be 60$
    //but you only have 50$
    //the rest money if you can give all you can buy everything if not cnt buy
            //total
    //amountPaid
    //askforrest

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("Please enter the total amount you have");
        double amountPaid=input.nextDouble();

        if(amountPaid>=60) {
            System.out.println("you can buy the products");

        }else if(amountPaid<60) {
            double leftover = 60 - amountPaid;

            System.out.println("Please enter rest of the money " + leftover);
            double restMoney = input.nextDouble();
             if(restMoney>=leftover){
                    System.out.println("you can buy the products");


             }else{
                 System.out.println("you will not be able to purchase");
             }
            }
        }
    }


