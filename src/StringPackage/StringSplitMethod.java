package StringPackage;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String SchoolName = "Techtorial Academy 2019 September April";

        String[] words = SchoolName.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words) {

            if (word.startsWith("A")) {
                System.out.println(word);
            }
        }
    //split the string and print only year

        String date="09/16/2019";
        String [] dates=date.split("/");

        System.out.println(dates[0]);
        System.out.println(dates[1]);
        System.out.println(dates[2]);

        String startDate="09.16.2016";
        String [] startDates=startDate.split("\\.");
        System.out.println(Arrays.toString(startDates));
        System.out.println(startDates[0]);

        System.out.println(startDate.replace("1"," "));


//        System.out.println(Arrays.toString(dates));




//        for (String year:dates){
//            if (year.startsWith("2")){
//                System.out.println(year);
            }
        }






