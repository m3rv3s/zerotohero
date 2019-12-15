package ArrayList;

public class Animal {

    /* instance variables are name, age , area, dailymeal
    create no argument constructor
    create 4 argument constructor and initialize instance variables


    create Animal Test class
    create 5 instance of the animal class
    create arraylist and store your animals to the arraylist
    using forloop increase daily meal of all objects
     */

        String name,area;
            int age,dailymeal;

        public Animal(){

}
public  Animal(String name,int age, String area,int dailymeal){
            this.name=name;
            this.age=age;
            this.area=area;
            this.dailymeal=dailymeal;
        }
public void increaseDailyMeal(){
            dailymeal+=10;


}


}
