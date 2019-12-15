package Polymorphysm00P;

public class Man extends Human implements dad {


@Override
    public void eat(){
    System.out.println("man is eating");
}
@Override
    public void walk(){
    System.out.println("man is walking");
}
@Override
    public void Shave(){
    System.out.println("man is shaving");

}
public void playSport(){
    System.out.println("Man is playing soccer");
}


    @Override
    public void feed() {

    }
}
