package ScannerPackage;

import java.util.Scanner;

public class ProjectTwo {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.println("Please enter random Word:");

        String randomWord=input.nextLine();

        System.out.println("Please enter length of the word:");

        int l=input.nextInt();

        boolean leng=l==randomWord.length();
        System.out.println("Your lenght is:"+leng);

        System.out.println("please enter a letter you want to index:");
        String let=input.next();
        int letIndex=randomWord.indexOf(let.charAt(0));

        System.out.println("index of entered letter is :" + letIndex);



    }
}
