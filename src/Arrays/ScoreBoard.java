package Arrays;

import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        char[] teams={'A' , 'B' , 'C'};
        //user should input score number
        //please enter score ofr team A

        //PLease enter scre for team B
        //...
        //A***
        //B *****
        //C *
         Scanner input=new Scanner(System.in);
        System.out.println("Please enter your Score for team A:");
            int scoreA=input.nextInt();
        System.out.println("Please enter your Score for team B:");
        int scoreB=input.nextInt();
        System.out.println("Please enter your Score for team c:");
        int scoreC=input.nextInt();

        for (char t:teams){
            if (t=='A') {
                String stars = "";
                for (int i = 0; i < scoreA; i++) {
                    stars=stars+"*";
                }
                System.out.println("A " + stars);
                break;
            }}
                for (char b:teams){
                    if (b=='B') {
                        String starsB = "";
                        for (int a = 0; a < scoreB; a++) {
                        starsB=starsB+"*";
                        }
                        System.out.println("B " + starsB);
                        break;
                    }
                    }

                        for (char c:teams){
                            if (c=='C') {
                                String starsC = "";
                                for (int f = 0; f < scoreC; f++) {
                                    starsC=starsC+"*";
                                }
                                System.out.println("C " + starsC);


                            }}}}