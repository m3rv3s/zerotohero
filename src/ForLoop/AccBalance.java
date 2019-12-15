package ForLoop;

import java.util.Scanner;

public class AccBalance {

    public static void main(String[] args) {

        /*
        accont balance input
        and transactions
        accountbalance-transaction
        transaction
        account balance-transaction
        you balance is 0
           if you your transaction more than your balance it should print out "you dont have enough balance"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your account balance");

        int accBalance = input.nextInt();


        while (accBalance>0){
            System.out.println("please enter your transaction?");
            int transaction = input.nextInt();
            if (accBalance<transaction){
                System.out.println("you dont have enough balance " + "your balance is  " + accBalance);

            }else{
                    accBalance=accBalance-transaction;
                System.out.println("your  balance is " + accBalance + " Thank You ! ");


                }

        }

















        //        int lefOver = accBalance - transaction;
//
//        if (transaction <= accBalance) {
//            System.out.println("Make more transactions");
//            int moreTrans = input.nextInt();
//            moreTrans = accBalance - transaction;
//
//            System.out.println("Thank you for your purchase");
//
//        } else {
//            System.out.println("You dont have enough balance");
//        }


    }

    }
