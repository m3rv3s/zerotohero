package HomeWork;

public class ArrayHw1 {

    public static void main(String[] args) {
       /* Int[] nums={1, 2, 3, 5, 11, 9, 7, 0, 0};
        Output:  0, 0, 7, 3, 2, 1, 9, 11, 5*/

     int[] numbers={0, 0 , 1 , 2 , 3 , 5 , 7 ,9,11};
        //for (int m:numbers)
     for (int i=numbers.length-1;i>=0;i--){

         System.out.print(numbers[i] + ",");
     }






    }
}
