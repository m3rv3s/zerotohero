package IfPackage;

import java.util.Scanner;

class Colors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter child's school:");

        String school=input.nextLine();



        if (school.equalsIgnoreCase("kindergarden")) {
            System.out.println("School color is Red");
        }else if(school.equalsIgnoreCase("elemantry")) {
            System.out.println("school color is Blue");
        }else if(school.equalsIgnoreCase("middle school")){
            System.out.println("school color is white shirts and gray pants");

        }else if (school.equalsIgnoreCase("high school")){

            System.out.println("school color is blue shirts and blue pants");


        }


    }
}
