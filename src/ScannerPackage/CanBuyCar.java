package ScannerPackage;

import java.util.Scanner;

public class CanBuyCar {


    public static void main(String[] args) {

       Scanner input=new Scanner (System.in);

       System.out.println("how much do you have? ");

       double currentSaving=input.nextDouble();


        System.out.println("How much is the car? ");

        double carPrice=input.nextDouble();

        double difference=carPrice-currentSaving;


        boolean canBuy=currentSaving>=carPrice;

                System.out.println("difference between current saving and car price is " + difference);


        System.out.println("Can i buy the car? " + canBuy);

        //for string input.next if entering only one value.
        // need to enter more than one string you need to use input.nextline;


        System.out.println("Where do you live? ");
        String city=input.next();

        System.out.println("My current city is "+ city);
    }
}
