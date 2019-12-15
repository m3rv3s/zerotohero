package ForLoop;

public class ForLoopPrac {

    public static void main(String[] args) {



        //int num; int num1;
        //inside for loop w can only put two times';'
        //both data type should be same
        //we can not put more than two semicolon inside loop initialization block


        int i=0;
        for (; i>8;i++){
            System.out.println(i);


        }

        System.out.println("outside of the loop " +i);//8

        for (int k=0;k<5;k++){
            int num=5;   //since num is inside oop i can not use it outside of loop
            num++;

        }
    //    System.out.println(num); since num is inside loop i can not use it outside of the loop
    }

//you can not use the variables outside of the loop if you declare them inside
//of the loop, if you declare the variable inside the loop you cannot use the outside of the loop



}
