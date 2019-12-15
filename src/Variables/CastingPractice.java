package Variables;

public class CastingPractice {

    public static void main(String[] args){

        short samsung=1000;

        short apple=900;

        short totalPrice=(short)(samsung+apple);

         //byte,short,int and long is called integral values
        //float and double is called floating point numbers

        long studentNumber=1200;
        // we need to cast the values to smaller values

        int studentNumber1=(int)1200l;

        long num=studentNumber;

        double st=num;

        double  K=800.7d;

        int l=(int)K;
        System.out.println("the L is " + l);

        int x=12;
        int y=5;

        x*=y; // compound assignments x=x*y; 50 x=x+y; 15
        // x=x/y;2 ,, x=x%y; x++, x+1 , x+=1;
        System.out.println(x);

                long L=5;
                int h=8;

         h=(int)l*h; //40

            // differences between "l*h" and h*=l;
        //1- if you are using l*h you need to explicitly cast the value
        //2- if you are using h*=l you dont need to cast explicity

        h*=l;

        byte bookNumber=15;
        int  bookPrice=5;


        bookNumber=(byte)(bookNumber*bookPrice);







        System.out.println(bookNumber);






















    }
}
