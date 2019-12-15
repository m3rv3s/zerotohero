package IfPackage;

import java.util.Scanner;

public class SAlesAssociate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //salesperson
        //base salary-400$
        //scanner how much they earn a week
        //please enter for monday
        //enter for hall 5 days
        //how much they will earn a week
        //total product price is more than 800 they will get 5% comission
        //40+400=440 they will get paid

        //if total sale is more thn 800 apply 5% commission
        //if total sale is less thn 800 dont apply comis and give the base sallary

        System.out.println("Please Provide amount base salary");
        int baseSalary = input.nextInt();

        System.out.println("Please Provide earning for Monday");
        int monday = input.nextInt();
        System.out.println("Please Provide earning for Tuesday");
        int tuesday = input.nextInt();
        System.out.println("Please Provide earning for Wednesday");
        int wednesday = input.nextInt();
        System.out.println("Please Provide earning for Thursday");
        int thursday=input.nextInt();
        System.out.println("Please Provide earning for Friday");
        int friday=input.nextInt();

        double totalPrice=monday+tuesday+wednesday+thursday+friday;
        System.out.println(totalPrice);

       double  weeklyPayment;

       if (totalPrice>800){
            weeklyPayment=totalPrice+800*0.05;
            System.out.println("Comission will apply "+ weeklyPayment);

        }else{
           System.out.println("Commision will not be applied");
       }

    }
}
