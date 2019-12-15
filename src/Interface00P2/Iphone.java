package Interface00P2;

public class Iphone extends CellPhone {
    @Override
    public void call() {
        System.out.println("Iphone is calling");
    }

    @Override
    public void text() {
        System.out.println("Iphone is texting");
    }

    @Override
    public void takePicture() {
        System.out.println("Iphone is taking pictures");

    }

    @Override
    public void location() {
        System.out.println("Iphone  doesn't have  flash card ");

    }

    @Override
    public void faceId() {
        System.out.println("Iphone has face id function ");

    }
}
