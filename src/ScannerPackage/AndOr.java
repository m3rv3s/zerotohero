package ScannerPackage;
import java.util.Scanner;

public class AndOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        int Number1 = input.nextInt();

        int Number2 = input.nextInt();

        int Number3 = input.nextInt();

        boolean equal=Number1==Number2 &&  Number2==Number3;


         System.out.println("Are they equal to each other? "+equal);



        //String Number2 = input.nextLine();

        //System.out.println("Enter Number3: ");

        //String Number3 = input.nextLine();

        // if (Number1.equals(Number2)  ||(Number2.equals(Number3) );
        //if (Number1.equals(Number2) || Number2.equals(Number3) || Number3.equals(Number1)) {




        }
    }
//}
