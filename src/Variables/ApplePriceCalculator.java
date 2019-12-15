package Variables;

public class ApplePriceCalculator {
    public static void main (String[] args){


       //apple price in FreshMarket is 1$
        int appleFreshMarket=20;

        // apple price in wholefoods is 3$
        int appleWholeFood=13;

        int totalAppleNumber=appleFreshMarket +  appleWholeFood ;

      //in total apple number=12+7
        System.out.println("my total apple number is " +  totalAppleNumber);

        int freshMarketPayment=appleFreshMarket*1;

    int wholeFoodPayment=appleWholeFood*1;


    System.out.println("Total payment of fresh Market is " +  freshMarketPayment);

    System.out.println("Total payment of whole food is " +  wholeFoodPayment);

        int totalPayment=freshMarketPayment +   wholeFoodPayment;

   System.out.println("Total payment is " + totalPayment);

        System.out.println(wholeFoodPayment+freshMarketPayment);
        System.out.println("20 " + "39");
        System.out.println("20 "+wholeFoodPayment);

        //decimal number for 'A' is 65
        //in int we can not store the character that's why it will automatically convert
        //character to decimal

        String A="A";

        System.out.println(A);
        //20 39
        //max and min number

        //declaring the variables where we are giving data type and giving the name for variables
        int studentNumber;

        //initializing the variables is giving value for variables
        studentNumber=25;

       // we can start variables with _ , $ , or letters

        int dateYear=1998;

        // you can end varibale name w/ numbers
        // you can not use same name two times

        int dateYear1=2000;

    int _public=2009;
    int maxNumber=Integer.MAX_VALUE;
    System.out.println("Max number for integer is " +maxNumber);

    //2147483647

        int number= 2147483647;

        int minNumber= Integer.MIN_VALUE;

                System.out.println("Min number for integer is " +minNumber);
    //-2147483648
        //32 bite equals 4 byte
        int mNumber=2147483647;



    }
}
