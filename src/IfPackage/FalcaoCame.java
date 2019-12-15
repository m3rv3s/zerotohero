package IfPackage;

import java.util.Scanner;

public class FalcaoCame {
    public static void main(String[] args) {

        //first galatasaray should pay 3mil to the club
        // gal should pay 5mil to Falcao

       // Scanner input=new Scanner (System.in);

        //System.out.println("Please enter the Galatasaray Budget: ");
        //int galBudget=input.nextInt();

        //System.out.println("Please enter Player Salary : ");
      //int playerSal=input.nextInt();

      //if (galBudget==3000000 && playerSal==5000000) {
         // System.out.println("Falcao can come to the Galatasaray : ");

      //}else{

          //System.out.println("Hala Gelmedi :(");



        //Microphone from amazon
        // using scanner input the star , review numbr and price for the microfone
        //4 stars and price should be less than 20$



        Scanner input=new Scanner (System.in);

        System.out.println("please enter the product that you want ; ");

      String product=input.nextLine();

        System.out.println("Please enter the stars that the product have :");

        int stars=input.nextInt();

        System.out.println("Please provide review number :");

        int review=input.nextInt();

        System.out.println("please provide the product price: ");

        int price=input.nextInt();

        if (stars>=4 && review>=100 && price<=20) {

            System.out.println("you can buy the " +product);

        }else{

            System.out.println("do not buy the microphone");





      }






    }
}
