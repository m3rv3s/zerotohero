package Static;

public class CatTest {


    public static void main(String[] args) {


        Cat dodo=new Cat();
        Cat prenses=new Cat();

        System.out.println(dodo.KitKab);
        System.out.println(prenses.KitKab);

        System.out.println(Cat.meowMix);

        Cat.eatMix(2);
        System.out.println(Cat.meowMix);

        Cat.eatMix(2);
        Cat.eatMix(8);
        Cat.eatMix(1);
        Cat.eatMix(0);

        dodo.eatKit(6);
        prenses.eatKit(5);



    }

}
