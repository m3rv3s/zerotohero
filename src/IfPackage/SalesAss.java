package IfPackage;

import java.util.Scanner;

public class SalesAss {

    // if total sale is more than = 800 and less 1000 commission 5
    // total sale is more than or equals to 1000 less than 1200 commission 7
    //  total sale is more than or equals to 1200 less than 1400 commission 9
    //  total sale is more than 1400 commission 11

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Provide earning for Monday");
        int monday = input.nextInt();
        System.out.println("Please Provide earning for Tuesday");
        int tuesday = input.nextInt();
        System.out.println("Please Provide earning for Wednesday");
        int wednesday = input.nextInt();
        System.out.println("Please Provide earning for Thursday");
        int thursday=input.nextInt();
        System.out.println("Please Provide earning for Friday");
        int friday=input.nextInt();

        double totalPrice=monday+tuesday+wednesday+thursday+friday;
        System.out.println(totalPrice);

        double  weeklyPayment;

        if (totalPrice>=800 && totalPrice<=1000) {
            weeklyPayment = totalPrice * 0.05;
            System.out.println("5% commision will apply " + weeklyPayment);

        }else if (totalPrice>=1000 && totalPrice<=1200) {
            weeklyPayment = totalPrice * 0.07;
            System.out.println("7% commision will apply " + weeklyPayment);

        }else if (totalPrice>=1200 && totalPrice<=1400) {
            weeklyPayment = totalPrice * 0.09;
            System.out.println("9% commision will apply " + weeklyPayment);

        }else if(totalPrice>=1400) {
            weeklyPayment = totalPrice * 0.11;
            System.out.println("11% commision will apply " + weeklyPayment);
            double leftOver=totalPrice-weeklyPayment;
            System.out.println(leftOver);

        }else{

            System.out.println("commission will not be applied " );

        }

    }


}
