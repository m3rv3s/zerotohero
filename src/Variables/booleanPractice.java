package Variables;

public class booleanPractice {

    public static void main (String[] args){

            boolean isLightOn=true;
            isLightOn=!true;


        System.out.println(isLightOn);


        int currentSpeed=60;
        int speedLimit=50;

        boolean increaseSpeed=currentSpeed<speedLimit; //true

        boolean decreaseSpeed=currentSpeed>speedLimit; //false


        System.out.println("increase speed is " + increaseSpeed);
        System.out.println("decrease speed is"+ decreaseSpeed);


        //avarage tempurature for the room is 72 f
        // if currentTemperature is less tahn 72F increase
        //current temperature is more than 72F decrease

        int currentTemp=60;
        int avarageTemp=72;

        boolean increaseTemp=currentTemp<avarageTemp;
        boolean decreaseTemp=currentTemp>avarageTemp;

        System.out.println(increaseTemp);
        System.out.println(decreaseTemp);

        // sell alcohol if person age is more than or equals to 21
        // dont sell if person age is less than 21

        int personAge=18;
        int legalAge=21;

        boolean sellAlcohol=personAge>=legalAge;
                boolean dontSellAlcohol=personAge<legalAge;

        System.out.println(sellAlcohol);
        System.out.println(dontSellAlcohol);


        //if you have 500.000 you can buy 5 room single house
        //if you dont have 500.000 you cannot buy the 5 room single house


        int moneyIHave=120_000;
        int housePrice=400_000;

        boolean buyHouse=moneyIHave>=housePrice;
        boolean dontBuyHouse=moneyIHave<=housePrice;

        System.out.println("buy the house " +buyHouse);
        System.out.println("dont buy the house " +dontBuyHouse);





































    }


}
