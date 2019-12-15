package HomeWork;

import java.util.Scanner;

public class OilChanges {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("How many years of oil change do you want to calculate?");
        int year = input.nextInt();
        int months= year*12;
        int change = 1;

        do {


            System.out.println(change+" . oil change");
            change++;

        }while (change<=months/3);
    }
}
