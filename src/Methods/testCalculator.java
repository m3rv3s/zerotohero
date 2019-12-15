package Methods;

import java.awt.event.FocusEvent;

public class testCalculator {

    public static void main(String[] args) {
       /* creating an object
       calcul --> class name
       c --> object name
       new calcul () -> creating an object
        */


        Calcul c=new Calcul();
        System.out.println(c.sum(22,43));
        System.out.println(c.substract(12,5));
        System.out.println(c.multiply(9,5));
        System.out.println(c.division(12,4));
        System.out.println(c.remainder(3,7));

        System.out.println("---------------------");
        System.out.println(c.calculator(10,5,"!"));
    }



}
