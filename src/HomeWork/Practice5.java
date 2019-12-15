package HomeWork;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /* Using scanner user will enter the number of times.
        Write the program to print following starts as users input.
        For Example using scanner user entered number 5.
        Example output:
        **********
        ************
        ***********
        ********
        *********
        if the user enter the another number like 7 then
        example output should be seven rows of starts.
        */

        System.out.println("please enter a word");
        String word=input.nextLine();
        int wordNum=1;

        while (wordNum<=10){

            System.out.println(word);

            wordNum++;


        }


    }
}
