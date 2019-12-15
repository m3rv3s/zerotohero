package IfPackage;


import java.util.Scanner;

public class ChaseBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the password for the phone: ");
        String passPhone = input.next();
        if (passPhone.equals("Tech2019.")) {
            System.out.println("Please enter password for Chase Bank:");
            String chasePass = input.next();

            if (chasePass.equals("Panda2400.")) {
                System.out.println("Welcome to Chase Bank App ");

            } else {
                System.out.println("please re-enter password");
            }
            }else{
            System.out.println("please enter phone password again");
            }
        }
    }
