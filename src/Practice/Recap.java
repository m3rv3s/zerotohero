package Practice;

import java.util.HashMap;
import java.util.Map;

public class Recap {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape", "Mango", "Strawberry", "Peach", "Cherry"};
        String[] vegetables = {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber", "Corn", "Bean", "Spinach", "Pepper"};
        String[] products = {"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar", "Salt", "Coffee", "Rice", "Pasta"};

        double[] fruitPrices = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69, 2.49, 4.99, 3.39, 1.79};
        double[] vegetablePrices = {3.99, 0.99, 1.99, 2.99, 2.49, 3.45, 1.99, 2.99, 2.45, 1.75};
        double[] productPrices = {3.29, 4.55, 7.99, 4.45, 7.45, 5.65, 1.99, 9.99, 6.49, 2.45};

        Map<String , Double> allProducts=new HashMap<>();

        for (int i=0;i<fruits.length;i++){
           allProducts.put(fruits[i],fruitPrices[i]);


        }
        for (int i=0;i<vegetables.length;i++) {
            allProducts.put(vegetables[i], vegetablePrices[i]);
        }
        for (int i=0;i<products.length;i++) {
            allProducts.put(products[i], productPrices[i]);
        }
        System.out.println(allProducts);



    }
}