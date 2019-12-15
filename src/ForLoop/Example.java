package ForLoop;


import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //cube of the number
        //5-9
        //5*5*5
        // (- - ) asagi dogru sayfdirma
        // (+ +) yukari dogru saydirma

        // for (int i=5; i<=9; i++){
        //  System.out.println(i*i*i);

        // }

//using scanner please enter the number 28
        //1, 2, 4, 7 , 14, 28
        //usinf for loop print entered number dividers

        for (int i = 1; i <= 28; i++) {
            if (28 % i == 0) {
                System.out.println(i);
            }
        }


    }}


