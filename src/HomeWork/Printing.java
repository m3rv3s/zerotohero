package HomeWork;

import java.util.Scanner;

public class Printing {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String star = "*****";
        while (star.length() >= 1) {
           star=star.substring(0,star.length()-2);
            System.out.println(star);
        }
    }
}