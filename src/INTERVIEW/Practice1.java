package INTERVIEW;

import java.util.Arrays;

public class Practice1 {


    public static void main(String[] args) {


    int num[]={4,7,5,15,38,56,0,3,9,9};

    for(int i=num.length-1; i>=0;i--){
        System.out.print(num[i]+ " ");


}
        System.out.println();
    int z=num.length-1;
    while( z >= 0){
        System.out.print(num[z] + " ");
        z--;
    }

    int sum=0;
    for (int s:num){
        sum += s;
    }
        System.out.println();
        System.out.print("sum of numbers is :" +sum);
        System.out.println();
        System.out.println("------------------------");

        int a[]={3,0,0,6,7,0,0,7,6,5};
        int num1[]=new int[num.length];
        int c=0;
        for (int i=0;i<num.length;i++){
            if (a[i]!=0 ){
                num1[c] =a[i];
                 c++;
            }
        }
        System.out.println(Arrays.toString(num1));


    }




}