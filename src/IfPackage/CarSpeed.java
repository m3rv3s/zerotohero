package IfPackage;

import java.util.Scanner;

public class CarSpeed {

    //using the scanner enter 3 diff input
        //gaspedal -- true/false
        // breakpedal --- true/false
        //gaspedalpercentage --number
        //enter current speed
        // enter speed limit
        //increasespeed=  cs<sl , gasp equals true ,
        // gaspedalpercentage more than 20 percent
        //breakpedal should be false

        public static void main(String[] args) {
            Scanner input=new Scanner (System.in);
            System.out.println("Whats your current speed:");
         int currentSpeed=input.nextInt();
            System.out.println("What is the speed limit:");
         int speedLimit=input.nextInt();
            System.out.println("Whats is your percentage of pressing gaspedal:");

            boolean gasPedal=input.nextBoolean();
            System.out.println("Whats is your percentage of pressing BreakPedal:");

            boolean breakPedal=input.nextBoolean();

            System.out.println("PLease provide the gas pedal percentage:");

            int gasPedalPercent=input.nextInt();

            Boolean increaseSpeed=currentSpeed<speedLimit && gasPedalPercent>20 &&gasPedal==true
                    && breakPedal==false;

                    //percentage if equals to 20 stays same
                    // percentage if less than 20 decrease the speed
                    //percentage more than 20 will increase the speed

            System.out.println("can i increase the speed " + increaseSpeed);













        }

}
