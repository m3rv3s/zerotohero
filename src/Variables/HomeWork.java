package Variables;

public class HomeWork {

    public static void main(String args[]){

        int payment$=60;
        int hour=8;
        int total=payment$*hour;



        System.out.println("total  daily rate of pay : $ " + total);


        int annual=total*365;

        System.out.println("Annual Salary w/ tax is : $" + annual);


        int stateTax=8;
        int federalTax=10;
        int totalTax=stateTax+federalTax;
        int totalPayment=(annual/100)*18;

        System.out.println("Total tax amount to pay is : $" + totalPayment);



        System.out.println("Annual Salary w/out tax is: $ "+ (annual-totalPayment));



    }


}
