package HomeWork;

public class ArraySum {

    /* 2. Given an array of ints length 7,
    print the sum of all the elements.
    Int[] nums={1, 2, 3, 5, 11, 9, 0};
    Output: Sum of numbers in Array is: 31
     */

    public static void main(String[] args) {

        int[] nums={0,1,2,3,5,9,11};
        int sum=0;


        for (int n:nums){
            sum=sum+n;


        }
        System.out.println("sum of the numbers is : " +sum);

    }


}
