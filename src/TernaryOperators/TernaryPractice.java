package TernaryOperators;

public class TernaryPractice {
    public static void main(String[] args) {

        int x=10;
        int y=5;
        int z=0;

        //booleanexpression ? value1 : value2 ;
        System.out.println( x > 5 ? 8 : 9 );
        System.out.println( y > x ? 8 : 9 );
        System.out.println( x > y ? (z=7) : ( z=3));
        System.out.println(z);

    }
}
