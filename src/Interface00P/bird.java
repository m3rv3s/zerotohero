package Interface00P;

public class bird implements Flyable,Sound{



    @Override
    public void fly() {
        System.out.println("bird is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("chik chik");

    } //you can implement as much as you want.
}
