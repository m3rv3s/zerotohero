package ScannerPackage;


import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("please provide the first amount");
        double firstAmount=input.nextDouble();

        System.out.println("please provide the second amount");
        double secondAmount=input.nextDouble();

        System.out.println("please provide the third amount");
        double thirdAmount=input.nextDouble();

        double totalSavings=firstAmount+secondAmount+thirdAmount;

        System.out.println("Phone Price");
        double phonePrice=input.nextDouble();

        System.out.println("Labtop Price");
        double labTopPrice=input.nextDouble();

        double totalSpending=phonePrice+labTopPrice;


        System.out.println("Total Spending is "+totalSpending);
        double leftAmount=totalSavings-totalSpending;
        System.out.println("The amount left after spending is "+leftAmount);












        //give amounts of 500,1000,1500
        //buy a phone and spent 750
        //buy a used computer and spend 300
        //calculate how much money left over in Savings


       // System.out.println("Provide money transaction on Savings:");

      //  int FirstTrans=input.nextInt();
        //int secondTrans=input.nextInt();
        //int thirdTrans=input.nextInt();
        //int inSavings=FirstTrans+secondTrans+thirdTrans;

        //System.out.println("total in savings:"+inSavings);

        //int phonePrice=input.nextInt();
        //int labTopPrice=input.nextInt();
        //int leftOver=phonePrice-labTopPrice;

       // System.out.println("Leftover money in Savings are : " +leftOver );









    }
}
