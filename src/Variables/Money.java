package Variables;

public class Money {
    public static void main(String[] args){


        int pocket=99;

        int pocket0;
        int pocket2;
        int pocket3;
        int pocket4;

        int penny=1;
        int quarter= 25;
        int dime=penny*10;
        int nickle=penny*5;



        pocket0=pocket/quarter;

        pocket2=pocket%quarter; //24

        pocket3= pocket2/dime;  //2

        pocket4=pocket%nickle;

        pocket=pocket%penny;

        System.out.println("eger bu para ile quarter alirsam: " +pocket0);
        System.out.println("eger bu para ile dime alirsam: " +pocket3);
        System.out.println("eger bu para ile nickle alirsam: " +pocket);
        System.out.println("eger bu para ile penny alirsam: " +pocket4);

    }
}
