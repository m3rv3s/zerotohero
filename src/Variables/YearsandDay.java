package Variables;

public class YearsandDay {

    public static void main(String [] args){

         double year,day,day2;

         year=365.0*24*60;
         day=24.0*60;
         day2= 694443.75%365;



         System.out.println(day2);
         System.out.println("one year is "+year+" Minutes ");
         System.out.println("one day is "+day+" Minutes ");

        System.out.println("1 min is "           +(1/year)+           "   Minutes   ");
        System.out.println("100 min is "         +(100/year)+            "     day ");
        System.out.println("1000 min is "        +(1000/year)+           "     day ");
        System.out.println("111111 min is "      +(111111/year)+         "     day ");
        System.out.println("999999000000 min is "+ (999999000000.0 /year) + "    year and 1 min is  "+(day2)+" day ");

    }
}
