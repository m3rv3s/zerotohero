package NestedLoop;

public class OilChange {


    public static void main(String[] args) {

        //imagine i am changing my oil after 2000 miles
        //i change the oil one time
        //every 500 miles i need to full my car tank
        //4 times full the tank then change oil
        //mt tank is empty i am getting tank is empty message
        //after 2000 miles I am getting change the oil message
        //i get the message for oil change, then change the oil

        int count=1;
        int count1=1;


        for (int i=0;i<4;i++){
            System.out.println(count++ + " please change oil");
            for (int gas=0;gas<4;gas++){
                System.out.println(count1++ + " PLease fill the tank");

            }
        }





    }



}
