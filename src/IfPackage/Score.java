package IfPackage;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        //grade a
        // using sanner enter average score
        // nce you enter average score you need to print the grade for verage score

        //  80-100 Grade A
        //60-80 Grade B
        //40-60 Grade C
        // 20-40 Garde D
        // 0-20 Grade F

        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter Your Average Score:");
        int score = input.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("your grade is A");

        } else if (score >= 60 && score <= 80) {
            System.out.println("your grade is B");

        } else if (score >= 40 && score <= 60) {
            System.out.println("your grade is C");


        } else if (score >= 20 && score <= 40) {
            System.out.println("your grade is D");


        } else if (score >= 0 && score <= 20) {
            System.out.println("your grade is F");

        }else {
            System.out.println("Your score is not defined");
        }

    }
}