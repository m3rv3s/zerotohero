package Switch;

import java.util.Scanner;

public class SwitchStudent {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("please enter student number");
        int sutdentNumber=input.nextInt();
        switch (sutdentNumber){

            case 123:
                System.out.println("Merve");
                break;
            case 236:
                System.out.println("Yasemin");
            break;
            case 250:
                System.out.println("Rumeysa");
                break;
            default:
                System.out.println("student number is not avaliable");
                break;


        }
    }
}
