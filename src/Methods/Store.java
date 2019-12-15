package Methods;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the quantity ? ");
        int quantity=input.nextInt();
        System.out.println("Please enter the price ? ");
        int price=input.nextInt();
       ProfitCal pr=new ProfitCal();
        if (quantity<20){
            System.out.println(pr.sell(price,quantity));

        }


    }
}
