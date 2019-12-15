package StaticPractice;

public class StaticTest {
    public static void main(String[] args) {

        StaticReview rev=new StaticReview();
        StaticReview rev1=new StaticReview();

        StaticReview.test();
        rev.test1();

        System.out.println( Math.addExact(10, 5));


        System.out.println("------------------------------");


        StaticReview b=new StaticReview();

        System.out.println(Math.addExact(6,4));
        System.out.println(Math.subtractExact(6,4));
        System.out.println(Math.multiplyExact(6,4));
       // System.out.println( Math.(8,4));



    }
}
