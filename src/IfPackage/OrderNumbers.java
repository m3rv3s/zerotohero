package IfPackage;

import java.util.Scanner;

public class OrderNumbers {

    public static void main(String[] args) {
        //1- one>two
        //2- one>three
        //3-one>four
        //4-two>three
        //5- two>four
        //6-three>four
Scanner input=new Scanner(System.in);


        System.out.println("Please enter four number");
    int one  =12;
    int two  =4;
    int three=7;
    int four =3;


    if(one>two){
        int temp=one; //12
        one=two; //4
        two=temp; //12

    }
    if(one>three){  //false
        int temp=one;
        one=three;                    //not be executed
        three=temp;

    }
    if(one>four){
        int temp=one; //4
        one=four;    //3
        four=temp;   //4
    }
    if(two>three){
        int temp=two;//12
        two=three;  //7
        three=temp;  //12

    }
    if(two>four){
        int temp=two; //7
        two=four;     //4
        four=temp;   //7
    }
    if(three>four){
        int temp=three; //12
        three=four;     //7
        four=temp;     //12
    }
        System.out.println(""+ one + "\n" + two +"\n" +  three +"\n"+ four);
        System.out.println(""+four+"\n"+three+"\n"+two+"\n"+one);
    }
}

// one =      , two=      , three=       , four=

