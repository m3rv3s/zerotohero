package Switch;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        // 1 - 5 ---Weekdays
        // 6 - 7 ---Weekends

        int number=2;
        switch (number){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekdays");
            break;
                case 6: case 7:
                    System.out.println("Weekends");
                break;


        }
    }
}
