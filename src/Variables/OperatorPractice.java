package Variables;

    public class OperatorPractice {

        public static void main(String[] args){

            //re-assigning variables
            /* variables can be assigned and re-assigned many times after declaring
             */

            int apple=7,banana, oranges=13;

            banana=9;
            banana=1;
            banana=4;

            System.out.println("banana number is :"+banana);

            banana=8;

            System.out.println("banana number is :"+banana);
             //banana=8
            //apple=7

            banana=apple;
            //banana=7
            //apple=7

            apple=banana;
                 // banana=7
                 // apple=7

            System.out.println("banana number is :"+banana);
            System.out.println("apple number is " + apple);
            System.out.println("orange number is "+ oranges);

       //banana=7
        banana=banana+1;

        System.out.println("banana number is :"+banana);

        banana=oranges+1;

        System.out.println("banana number is :"+banana);

        banana+=1;

            System.out.println("banana number is :"+banana);

            banana-=2;

            System.out.println("banana number is :"+banana);

            banana*=2;

            System.out.println("banana number is :"+banana);

            oranges%=5;

            System.out.println("orange number is :"+oranges);



            double taxAmount=10.5;
            float salary=40.7f;
            int number=100;

            double totalAmount=taxAmount+number+salary;

            byte k=10;
            short n=8;
            int totalNumber=k+n;
            double totalNumber1=k*n;
            float totalNumber2=k-n;

            // totalNumber=k/n;
            // totalNumber=k%n;

         int  berry=14;

            System.out.println(berry);

            System.out.println(berry++);

            System.out.println(berry);

            berry=++berry;

            System.out.println(berry);








        }















}
