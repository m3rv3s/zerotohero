package ScannerPackage;

import java.util.Scanner;

public class Banks {

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);

        System.out.println("Please enter a bank name:");

        String bankName=input.nextLine();
        int length1=bankName.length();

        System.out.println(bankName.charAt(0));
        System.out.println(bankName.charAt(length1-1));
        System.out.println(bankName.charAt(8));
        System.out.println(bankName.charAt(4));
        System.out.println(bankName.indexOf("k"));

        System.out.println("Please enter a bank name:");

        String bankName1=input.nextLine();
        int length2=bankName1.length();

        System.out.println(bankName1.charAt(0));
        System.out.println(bankName1.charAt(length2-1));
        System.out.println(bankName1.charAt(6));
        System.out.println(bankName1.charAt(4));
        System.out.println(bankName1.indexOf("k"));

        System.out.println("Please enter a bank name:");

        String bankName2=input.nextLine();
        int length3=bankName2.length();

        System.out.println(bankName2.charAt(0));
        System.out.println(bankName2.charAt(length3-1));
        System.out.println(bankName2.charAt(5));
        System.out.println(bankName2.charAt(4));
        System.out.println(bankName2.indexOf("k"));


    }
}
