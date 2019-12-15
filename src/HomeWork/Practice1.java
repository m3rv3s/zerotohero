package HomeWork;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

     //q r s t u
     //   1-  q > r
     //   2-  q > s
     //   3-  q > t
     //   4-  r > s
     //   5-  r > t
     //   6-  s > t


        int q=24;
        int r=6;
        int s=4;
        int t=8;



        if(q>r) {
            int temp = q; //temp=24
            q = r; //one=6
            r = temp; // two=24

        }


        if(q>s){
            int temp= q; //6
            q = s;  //4
            s=temp;//6
        }


        if(q>t){
           int temp=q;
           q=t;
           temp=t;

       }
        if(r>s){

            int temp=r; //24
            r = s;  //6
            temp= s; //24

}

   if(r>t){

       int temp=r ; //6
       r=t; // 8
       temp=t; //6



   }

   if (s>t){

       int temp=s; //24
       s=t; //6
       temp=t; //24

   }
        System.out.println(""+q+"\n"+r +"\n"+ s +"\n"+t);

    }
}
