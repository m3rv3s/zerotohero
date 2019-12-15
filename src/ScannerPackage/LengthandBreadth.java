package ScannerPackage;

import java.util.Scanner;

public class LengthandBreadth {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Enter Length Number: ");

        double length=input.nextDouble();

        System.out.println("Enter Breadth Number: ");

        double breadth=input.nextDouble();

        int total=(int)(length*breadth);

        System.out.println("Area "+total);




    }
}
