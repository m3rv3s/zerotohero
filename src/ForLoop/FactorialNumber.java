package ForLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("PLease enter a number");
       int number=input.nextInt();
      int factorial=1;

       for (int i=number;i>=1;i--){

      factorial=factorial*i;



       }
        System.out.println(factorial);
    }
}
