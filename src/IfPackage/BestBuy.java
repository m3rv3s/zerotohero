package IfPackage;

import java.util.Scanner;

public class BestBuy {

    //you go to bestbuy
//you wanna buy a phone
// to be able to buy this phone you need to pay 1000$
//if the user enter enough amount than user can buy the phone
//if not enter correct amount ask to user to rest of the  money amount

//BestBuy
//if user enters 1000 or more user can buy
// if user enters less than 1000 ask user for the rest of the money
    //please enter 300 more

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please search for the product that you want:");
        String product = input.nextLine();

        if (product.equals("NoteBook 10")) {
            System.out.println("Please enter the amount of payment: ");
            int amount = input.nextInt();

            if (amount >= 1000) {
                System.out.println("you are able to buy the phone");


            } else if (amount < 1000) {
                double leftover = 1000 - amount;

                System.out.println("Please enter the rest of the money: " + leftover);
                double restAmount = input.nextDouble();
                if (restAmount >=leftover) {
                    System.out.println("You can buy the Phone");
                } else {
                    System.out.println("you will not be able to buy the phone");
                }
            }


        }}}









