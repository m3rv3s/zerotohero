package Methods;

import java.util.Scanner;

public class invest {
    public static void main(String[] args) {
        Investment investment=new Investment();

        Scanner input=new Scanner(System.in);


        System.out.println("please enter an amount: ");
        investment.amount=input.nextDouble();

        System.out.println("please enter number of years you want to invest: ");
        investment.years=input.nextDouble();

        System.out.println("please enter the rate: ");
        investment.rate=input.nextDouble();

        System.out.println("your total will be " + investment.totalAmount() + " in  " + investment.years+ " years");
    }
}
