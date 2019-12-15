package WhileLoop;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);


      //  int number=input.nextInt();
       // int count=1;

      //  while (count<=10){
          //  System.out.println(number+"*"+count+"="+number*count);
   // count++;


        System.out.println("Please enter the number ");
        int number=input.nextInt();
        int count=0;

        while (count>0){
            number=number/2;
                    count=count+number;


        }

        System.out.println(count);







    }
}
