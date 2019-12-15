package ArrayList;

import java.util.ArrayList;

public class AnimalTest {

/*
    create Animal Test class
    create 5 instance of the animal class
    create arraylist and store your animals to the arraylist
                    using forloop increase daily meal of all objects
     */

    public static void main(String[] args) {

        Animal a1=new Animal("Tiger",4,"Africa",10);
        Animal a2=new Animal("monkey",5,"Africa",20);
        Animal a3=new Animal("Cat",6,"Africa",4);
        Animal a4=new Animal("elephant",7,"Africa",30);
        Animal a5=new Animal("Anacando",8,"Africa",8);

        //System.out.println(a5.dailymeal);
//        System.out.println(a1.dailymeal);
//        a1.increaseDailyMeal();
//        System.out.println(a1);

        ArrayList<Animal> animalList=new ArrayList();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);
        animalList.add(a5);



        for (int i=0;i<animalList.size();i++){

         animalList.get(i).increaseDailyMeal();
            System.out.println(animalList.get(i).dailymeal);
        }

    }

}
