package Variables;

public class Coins {

    public static void main(String[] args){

        /*
        given whole value from 1 to 99, calculate how many quaters, dimes
         */

        int cent=99;
        int quaters=cent/25;
        int centRemainder=cent%25; //24
        int dimes=centRemainder/10 ;
        int dimesRemainder=centRemainder %10;
        int nickles=dimesRemainder/5;
        int nicklesRemainder=dimesRemainder%5;
        int pennies=nicklesRemainder/1;



        System.out.println("quaters is "+ quaters);


        System.out.println("dimes is " +dimes);

        System.out.println("nickels is " +nickles);

        System.out.println("pennies is " +pennies);


    }
}
