package NestedLoop;

public class PrimeNumber {


    public static void main(String[] args) {

        int count = 0;
        System.out.println("1");

        for (int i = 1; i < 100; i++) {

            for (int k = 1; k <= i; k++) {

                //5
                //5 --  2 3 4  is prime
                if (i % k == 0) {
                    count++;

                }


            }
            if (count > 0) {
                System.out.println("is not a prime number");

            } else {
                System.out.println(i + " is a prime number ");
            }

            count = 0;

        }
    }
}