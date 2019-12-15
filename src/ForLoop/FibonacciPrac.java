package ForLoop;

public class FibonacciPrac {
    public static void main(String[] args) {
        // sum of the first 2 numbers is equals to next number
        //0,1
        //1-100;

        int num1=0,num2=1,sum=0;
        System.out.print(num1+" " +num2);

        for (int i=1;i<13;i++){

            sum=num1+num2;

            num1=num2;

            num2=sum;


            System.out.print(" " +sum);


        }

    }
}
