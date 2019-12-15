package IfPackage;

import java.util.Scanner;

public class AmazonPriceRates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your price");
        int price=input.nextInt();
        System.out.println("how many reviews: ");
        int reviews=input.nextInt();
        System.out.println("what is the rating: ");
        int rating=input.nextInt();

        if(price<=50 && reviews>=200 && rating>=4){
            System.out.println("Product is on the first page");

        }else if(price>=50 && reviews>=200 && rating>=4){
            System.out.println("Product is on the second page");

        }else if (price<=50 && reviews<=200 && rating>=4){
            System.out.println("Product is on the third page");
        }else if (price>=50 && reviews<=200 && rating<=4){

        }else{
            System.out.println("Remove the product from amazon");
        }



    }
}
