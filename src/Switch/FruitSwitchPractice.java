package Switch;

import java.util.Scanner;

public class FruitSwitchPractice {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String productName=input.nextLine();
        switch (productName){

            case "Strawberry":
                System.out.println("Matching value is "+productName);
                break;
            case "Cranberry":
                System.out.println("Matching value is "+productName);
                break;
            case "Chocolate":
                System.out.println("Matching value is "+productName);
                break;
            case "Banana":
                System.out.println("Matching value is "+productName);
                break;
            default:
                System.out.println("no matching value");
        }
    }
}
