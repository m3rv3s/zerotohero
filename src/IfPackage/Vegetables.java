package IfPackage;

import java.util.Scanner;

public class Vegetables {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Provide amount of tomatoes");
        double tomatoes = input.nextDouble();
        System.out.println("Please Provide amount of cucumber");
        double cucumbers = input.nextDouble();
        System.out.println("Please Provide amount of Carrots");
        double carrots = input.nextDouble();
        System.out.println("Please provide amount of Eggplant");
        double eggplant=input.nextDouble();

        double totalPrice=(tomatoes*1)+ (cucumbers*.50)+ (carrots*.25) + (eggplant*2);

        System.out.println("My total Price without discount is : " +totalPrice);

        if (totalPrice>=10){
            totalPrice = totalPrice - totalPrice*0.10;



            System.out.println("i Will purchase veggies w/ discount: "+ totalPrice);

        }else{


            System.out.println("dont need a discount " + totalPrice);


        }

    }
}
