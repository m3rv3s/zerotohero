package Practice;

import java.util.Scanner;

public class Practice9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //6 times enter the number
//        please enter the number
//                6-first
//               10-
//               8--
//               4
//               23
//               20
//


        System.out.println("Please enter a total number of your chose");
        int totalNumber=input.nextInt();

        System.out.println("please enter number" + totalNumber +" of times ");

        int firstNumber=input.nextInt();

        for (int i=1;i<totalNumber-1;i++){
            // this loop needs to run 5 times
            int secondNumber=input.nextInt();
            if (secondNumber>firstNumber){
                firstNumber=secondNumber;

            }


        }

        System.out.println(firstNumber);


    }
}


///find the smallest number