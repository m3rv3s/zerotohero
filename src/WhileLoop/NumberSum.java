package WhileLoop;

import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int number1 = 30;
        int number2 = 20;


        while (number1 >= number2) {

            System.out.println(number1);
            number1--;

        }
    }
}