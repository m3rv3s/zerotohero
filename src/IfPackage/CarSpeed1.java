package IfPackage;


import java.util.Scanner;

public class CarSpeed1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Provide your car speed:");

        int carspeed = input.nextInt();

        if (carspeed >= 1 && carspeed < 20) {
            System.out.println("CAR GEAR IS 1");

        } else if ( carspeed >=20 && carspeed<40) {
            System.out.println("Car Gear is 2");
        }else if ( carspeed>=40 && carspeed<60) {
            System.out.println("Car Gear is 3");
        }else if (carspeed>=60 && carspeed<80) {
            System.out.println("Car Gear is 4");
        }else if (carspeed>=80 && carspeed<120) {
            System.out.println("Car Gear is 5");
        }else if (carspeed<0 && carspeed>=-20){
            System.out.println("Car Gear is Rear");
        }else{
             System.out.println("Speed is not defined or entered wrong");
        }

        }

    }

