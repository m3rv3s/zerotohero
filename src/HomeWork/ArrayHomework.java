package HomeWork;

import java.util.Arrays;

public class ArrayHomework {

        /*Write a public and non-static method that
         will accept arrays of
        Integer as a parameter and will return array of
        integers size of 3 which will have max Number,
         min Number, and average number.
         */

        public int[] homework(int[] arr){

            int[] result=new int[3];
            Arrays.sort(arr);
            result[0] = arr[0];
            result[1]=arr[arr.length-1];
            int sum=0;
           //(5,2,3,10)

            for (int i=0; i<arr.length;i++){
                sum=sum+arr[i];
            }

        int average=sum/arr.length;

            result[2]=average;

             return result;
        }











    }

