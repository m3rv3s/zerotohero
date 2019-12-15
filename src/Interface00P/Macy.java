package Interface00P;

public class Macy implements Store {

    @Override
    public void sellItem() {
        System.out.println("macys selling shoes");
    }

    @Override
    public int countEmployee() {
        return 0;
    }
}
