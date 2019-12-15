package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

           /*task
        create new class named fruits
        create first main
        one arraylist called fruitlist
        using Scanner add 5 fruit to your arraylist
        print all the items inside your arraylist
         */

        ArrayList <String> fruitList=new ArrayList();
     /*if you dont specify the data type of your arraylist
         it will store every element
         as a object.
     */
        System.out.println("please enter 5 different fruit types");
        int count=5;

        for (int i=0;i<5;i++) {

            fruitList.add(input.nextLine());
            count--;


            System.out.println(count + " times you can enter the fruit");



        }

            System.out.println(fruitList);

        System.out.println("--------------------------");



        for (int i=0;i<fruitList.size();i++) {
            fruitList.set(i,fruitList.get(i).toUpperCase());
            System.out.println(fruitList);
            }// make all your fruits upper case
        System.out.println(fruitList);

        System.out.println("--------------------------");

        for (String s:fruitList ){

        if (s.startsWith("B")){
            System.out.println(s);
        }
        }
        //Secondway:
        //   for (int i=0;i<fruitList.size();i++){
        //    if (fruitList.get(i).startsWith("B")){
        //        System.out.println(fruitList.get(i));
    }
}

