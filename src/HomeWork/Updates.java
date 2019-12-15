package HomeWork;

import java.util.Scanner;

public class Updates {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);



        System.out.println("Please enter number of days");
        int numberOfDays=input.nextInt();

        int updates=numberOfDays/15;
        int line = 1;

        do { System.out.println(line+". update(s) available");
            line++;

        }while (line<=updates);
    }
}

