package Collection;

import java.util.HashSet;

public class FlowerTest {

    public static void main(String[] args) {


        Flower flower=new Flower("Tulip",11432);
        flower.addFlower("Rose",21213);
        flower.addFlower("Chamomile",321908);
        flower.addFlower("Orchid",8132183);

        int  flowerBarcode=flower.findFlower("Rose");
        System.out.println(flowerBarcode);

        String flowerName=flower.findFlower(8132183);
        System.out.println(flowerName);

        System.out.println("This is the list of flowers: ");
        flower.printAllFlower();
        System.out.println("this is after removing : ");
        flower.printAllFlower();









    }

}
