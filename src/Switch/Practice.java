package Switch;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        char ch='a';
       final char hr='h';
        switch (ch){

            case 'a':
                System.out.println("the value is apple");
                break;
            case 'b':
                System.out.println("The value is blackberry");
                break;
            case hr:
                System.out.println("the value is hr ");
                break;

                // in case statement values should be constant (not changing)
                //in java if you want to make one value as a constant
                //we are using final keyword



        }
    }
}
