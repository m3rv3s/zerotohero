package IfPackage;

import java.util.Scanner;

public class BankOfAmerica {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your username: ");
        String username=input.next();
        //username
        //password
        //captca

        if (username.equals("mturan")){
            System.out.println("please enter your password: ");
            String password=input.next();
            if(password.equals("DesPlaines21")){
                System.out.println("Please enter the Captca: ");
               String captca=input.next();

                if(captca.equals("beam")){
                    System.out.println("Welcome to Bank OF America! ");

                }else{
                    System.out.println("Please re-enter Captca");
                }
            }else{
                System.out.println("Please re-enter password");
            }
        }else{
            System.out.println("Please re-enter username");
        }
    }
}
