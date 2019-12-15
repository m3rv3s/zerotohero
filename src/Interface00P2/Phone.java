package Interface00P2;

public abstract class Phone extends Object implements  flashCard ,FaceRecognition {

    public Phone(){
        System.out.println("I am Phone Constructor");

    }

    String name;
    String model;
    int size;

    public abstract void call();
    public abstract void text();
    public abstract void takePicture();




}
