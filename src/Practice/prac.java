package Practice;

import java.util.Arrays;

public class prac {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,10,15,21,30};
        System.out.println(Arrays.toString(fizzBuzz(new int[]{2,3,5,10,15,21,30})));
        System.out.println(findMax(arr));
    }
    public static String[] fizzBuzz(int[] arr){
        //1. new array
        String[] newArr = new String[arr.length];
        //2. for loop, check each element
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3==0 && arr[i]%5==0){
                newArr[i]="FizzBuzz";
            }else if(arr[i]%3==0){
                newArr [i]="Fizz";
            }else  if (arr[i]%5==0){
                newArr[i]="Buzz";
            }else{
                newArr[i]=""+arr[i];
            }
        }
        return newArr;
    }
    public static int findMax(int[] arr) {
        if(arr.length==0) return 0;
        int maximum = arr[0];
        for(int i:arr){
            if(i>maximum)maximum=i;
        }
        return maximum;
    }
    public static int secondMax(int[] arr){

   if (arr.length<2) return 0;
   int maximum=0 , secondMax=0;
    for (int i:arr){
        if (i>maximum){
         secondMax=maximum;
        }else
        if (i<maximum &&i>secondMax)secondMax=i;

    }
return 0;
    }
}