package ScannerPackage;

import java.util.Scanner;

public class ExamResult2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


   //exam score 60,90
        //calculate avarage
        //should attend school
        //complete assign 2
        //would student attend school for the semester?


        System.out.println("whats is your exam Scores?: " );

        int exam1=input.nextInt();
        int exam2=input.nextInt();

        int averageScore=(exam1+exam2)/3;

        System.out.println("Avarage score is :"+averageScore);
        System.out.println("Did student attend all classes? ");

        boolean  attend=input.nextBoolean();

        System.out.println("completed assignments? ");

        int completedAssign=input.nextInt();


        boolean  result=averageScore>=60&&attend==true&&completedAssign>=6;

        System.out.println("can student attend school for the semester? "+result);





















    }
}
