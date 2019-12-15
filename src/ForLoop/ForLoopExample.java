package ForLoop;

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {


        for (int i=0; i<10; i++){
            System.out.println(i);
        }

        for (int i=1; i<=5; i++){
            System.out.println("Merve");

        }

        for (int i=9; i>=0 ; i--){
            System.out.println(i);

        }

            Scanner input = new Scanner(System.in);
            int number;
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                System.out.println("PLease enter the number");
                number = input.nextInt();
                sum = sum + number;
            }
        }
    }



