package Projects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GroceryList extends  GroceryBuddy {


  static   String [] fruits={"apples","Oranges","watermelon","banana","pineapple","grape","mango","strawberry","peach","cherry"};
  static   String [] vegetables={"carrots","broccoli","onion","potato","corn","bean","spinach","pepper"};
  static  String [] otherProduct={"milk","bread","eggs","chicken","sugar","salt","coffee","rice","pasta"};


    double [] fruitPrice={1.99,2.99,1.50,.70,.90,1.30,.60,.80,1.20,2.00};
    double [] VegetablePrice={1.99,2.99,1.50,.70,.90,1.30,.60,.80,1.20,2.00};
    double [] otherPrice={1.99,2.99,1.50,.70,.90,1.30,.60,.80,1.20,2.00};

public  static void printFruits(){
    System.out.println(Arrays.toString(fruits));
}
public void printVeggie(){
    System.out.println(Arrays.toString(vegetables));
}
public void others(){
    System.out.println(Arrays.toString(otherProduct));
}
public double getItemPrice(String productName) {
    Scanner item = new Scanner(System.in);
    System.out.println("please enter a product:");
    String product = item.nextLine();
    for (int i = 0; i < fruits.length; i++) {
        if (fruits[i].equalsIgnoreCase(productName)) {
            System.out.println(fruits[i] + "'s  $ " + fruitPrice[i]);
        }
    }
    return 0;
}

}
