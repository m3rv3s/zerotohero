package ScannerPackage;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //need to enter 3 diff exam result 70,45,90
        //if average is equals to 70 or more than 70
        //should attend all classes
        //should complete at least 6 assign.
        //will student be able to attend semester or not?

        System.out.println("Enter 3 Results:");

        System.out.println("Please provide your  Exam Results?");
        int firstExam=input.nextInt();

        int secondExam=input.nextInt();

        int thirdExam=input.nextInt();

        int averageResult=(firstExam+secondExam+thirdExam)/3;
        System.out.println("average score is: "+averageResult);
        System.out.println("Did student attend all of the classes?");
        boolean  attend=input.nextBoolean();
        System.out.println("Completed assignments: ");

        int completedAssign=input.nextInt();

        boolean result=averageResult>=70&&attend==true&&completedAssign>=6;

        System.out.println("Can student attend class for next semester? "+result);



    }
}
