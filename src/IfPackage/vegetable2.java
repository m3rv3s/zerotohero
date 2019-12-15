package IfPackage;

import java.util.Scanner;

public class vegetable2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please provide number of Tomatoes");
        double Tomatoes=input.nextDouble();
        System.out.println("please provide number of Cucumber");
        double Cucumber=input.nextDouble();
        System.out.println("please provide number of Carrot");
        double Carrot=input.nextDouble();
        System.out.println("please provide number of Eggplant");
        double Eggplant=input.nextDouble();
        double totalprice=(Tomatoes * 1) +(Cucumber * 0.50) +(Carrot * 0.25) + (Eggplant * 2);
        System.out.println(totalprice);
        //double result=totalprice -(totalprice*0.10);

        //System.out.println("What is my result after discount ? " + result );
        if(totalprice >10 ){
            totalprice = totalprice - totalprice*0.10;
            System.out.println("I pay total price with discount " + totalprice );
        }else{
            System.out.println("I dont get any discount " + totalprice );
        }
    }
}






