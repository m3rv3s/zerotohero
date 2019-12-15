package Interface00P2;

public interface flashCard extends FaceRecognition {

    //public static final int Size=128;
    int SIZE=128;
    //public abstract void location ();
    void location();

    default void regularMethod(){
        System.out.println("regular method from flashcard interface");
    }
    static void staticMethod(){
        System.out.println("static method from flashcard interface");
    }
}
