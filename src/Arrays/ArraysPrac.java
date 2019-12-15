package Arrays;

import java.util.Arrays;

public class ArraysPrac {

    public static void main(String[] args) {

        int [] numbers=new int[5];
        //it has to start with 0
        numbers[0]=1;
        numbers[1]=5;
        numbers[2]=10;
        numbers[3]=15;
        numbers[4]=20;
//        numbers[4]=20; you can write as much as you want but it will only print 3 [3] that is in array

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers.length);

//        System.out.println(numbers[0]); you can write 100 lines like tthis to print 100 numbers but this is the long way to do it.
        //you have to use for loop to make it shorter and easier
        System.out.println("******************");

        //0,1,2,3,4,5
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);


        }
    }

}
