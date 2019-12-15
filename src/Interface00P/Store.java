package Interface00P;

public interface Store {

    /* ALL VARIBALES OF INTERFACE ARE:
    public static final
    public static final int capacity
     */

    int CAPACITY=20;

    //public abstract

    void sellItem();
    int countEmployee();

   default void displayItem(){
       System.out.println("displaying item in store interface");

    }


}
