package Practice;

import java.util.Scanner;

public class PracticeOilChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.println("how many years would you want your oil change");

        int year=input.nextInt();
        int month=year*12;
        int times=month/3;
        int changes=1;

        do {

            System.out.println(changes + (" times oil change"));

            changes++;


        }while (month<=year);



    }
}
