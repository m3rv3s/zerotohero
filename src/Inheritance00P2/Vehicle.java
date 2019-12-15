package Inheritance00P2;

public class Vehicle {

    String make;
    int year;

    public  Vehicle(){
        super();

    }
public Vehicle(String make){
        this();
        this.make=make;
}public  Vehicle(String make, int year){
        this(make);
        this.year=year;
    }

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        Vehicle v2=new Vehicle("toyota",2018);

    }


}
