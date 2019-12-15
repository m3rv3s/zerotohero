package NestedLoop;

public class ProductNumber {

    public static void main(String[] args) {

        //        For n=123456, the output should be
        //        1*2*3*4*5*6 ------> the product
        //                Sum=1+2+3+4+5+6;
        //
        //        Result= product-sum;
        //123456%10=6
        //number=123456/10=12345
        //number %10=5
        //number=number/10; 1234
        //number%10=4
        //number>0
//    int number=123456;
//int product=1;
//      int sum=0;
//       while (number>0){
//           System.out.println(number%10);
//           product+=number%10;
//           sum=number%10;
//
//           number=number/10;
//       }
//
//        System.out.println(product-sum);



//        for (int i=number;i<0;i++){
//            System.out.println(i%10);
//
//            i=number/10;

        int number=56789;
        int product=2;
        int sum=0;
        while (number>0){
            System.out.println(number%10);
            product+=number%10;
            sum=number%10;

            number=number/10;
        }

        System.out.println(product-sum);





    }

    }

