package INTERVIEW;

import INTERVIEW.ManipulatesString;

import java.util.ArrayList;

public class ManipulateStringTest {
    public static void main(String[] args) {


        ManipulatesString str=new ManipulatesString("M4T98KL1");

        int sumNumber=str.sumNumber();
        System.out.println(sumNumber);

        ArrayList<Character> letterList=str.getLetterList();
        System.out.println(letterList);
    }
}
