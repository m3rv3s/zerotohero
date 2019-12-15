package Inheritance00P;

public class Zoo {
    public static void main(String[] args) {

        WildAnimal wildAnimal=new WildAnimal();
        wildAnimal.eat();
        wildAnimal.sleep();
        wildAnimal.run();

        System.out.println("====================");

        Animal an=new Animal();
        an.sleep();
        an.eat();

    }
}
