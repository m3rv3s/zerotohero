package Interface00P;

import javax.crypto.Mac;

public class example {
    public static void main(String[] args) {

        bird b=new bird();
        b.fly();
        b.makeNoise();

        System.out.println("----------");
        Plane p=new Plane();

        p.fly();
        p.makeNoise();

        System.out.println("----------------");
        Macy m=new Macy();
        m.countEmployee();
        m.sellItem();

    }
}
