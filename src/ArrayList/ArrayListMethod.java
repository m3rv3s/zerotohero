package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {


        ArrayList <String> nameList=new ArrayList<>();
        /* once i create the nameList, i am saying only i can store

         */

        nameList.add("Adam");
        System.out.println(nameList);

        nameList.add("John");
        nameList.add("Steve");
        System.out.println(nameList);

        nameList.add(1,"David");
//if you try to add value to your arraylist and your arraylist number
// is less than index number it will give you outofboundexception

        System.out.println(nameList);

        List item=new ArrayList();
        item.add("banana");
        item.add(1,"orange");
        System.out.println(item);
        System.out.println(item.get(0));
        System.out.println(item.get(1));


        /*task
        create new class named fruits
        create first main
        one arraylist called fruitlist
        using Scanner add 5 fruit to your arraylist
        print all the items inside your arraylist
         */

        System.out.println(nameList);
        nameList.remove("John");
        System.out.println(nameList);
        nameList.remove(1);
        System.out.println(nameList);
        nameList.remove(5);
        //if given index number is longer than the size of Arraylist
        //it will throw exception

        nameList.remove("trump");

        ArrayList<Integer> prices=new ArrayList<>();

        prices.add(1);
        prices.add(2);
        prices.add(3);

        //int  value is automatically converted to the integer object. it is called autoboxing

        prices.remove("1");
        System.out.println(prices);
        prices.set(1,5);
        System.out.println(prices);
        System.out.println(prices.isEmpty());
        //since prices Arraylist is not empty . isEmpty method will return false.

        System.out.println(prices.size());

        // make all your fruits upper case


    }
}
