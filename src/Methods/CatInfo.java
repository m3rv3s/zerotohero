package Methods;

import java.awt.*;

public class CatInfo {
    //it has 5 differendr attributes-instance variables
    //name,age,color,boolean isRunning; ,kind , speed
    //creat a method nama start() --> it will make running boolean--true
    //create a method name stop() --> it will make isRunning ---> false
    // create on method name run(String direction ) ---> it will print which direction your cat running

    // create one method to print all the cat information
    //create on method to accelarate speed of your cat - it will take one parameter as an target speed and
    // it will print all accelaration speed
    // create one method to slowdown your cat
    /* current speed
    target speed

     */
//what is the instance of the class  means object of the class

    String name;
    String type;
    String color;
    int age;
    boolean isRunning;
    int speed;

    public boolean start () {
       isRunning=true;
       return isRunning;
    }
     public boolean stop (){
         isRunning=false;
        return isRunning;

    }
    public void run(String Direction){
        System.out.println("the cat is running " + Direction);

    }

    public void CatInformation(){
        System.out.println("Name:" + name);
        System.out.println("Type:" + type);
        System.out.println("Color:" + color);
        System.out.println("Age:" + age);
        System.out.println("Speed:" + speed);
        System.out.println("is running : " + isRunning);
//        CatInfo() cat=new  CatInfo();
//        cat.name="";
//        cat.type="";
//        cat.color="";
//        cat.age="";



        }
// current speed is 0 -- target speed is 6
        public void accelerate(int targetSpeed){
        int currentSpeed=speed;
        while(currentSpeed<=targetSpeed){
            System.out.print(currentSpeed); //firts it will print out 0 then 1 , 2 ,3 , 4 , 5 , 6
            speed=currentSpeed;
            currentSpeed++;
        }
}
        //current speed is 6 ---Targetspeed is 3
        public void slowDown(int targetSpeed){
       for (int i=speed;speed>targetSpeed;i--){
           System.out.print(i);
           speed=i;

           //        while (speed>=targetSpeed){
//            System.out.print(targetSpeed);
//            speed--;
        }
        }

    public static void main(String[] args) {
        CatInfo minnosh=new CatInfo();
        minnosh.name="dodo";
        minnosh.age=1;
        minnosh.type="Scottish";
        minnosh.color="orange";

        minnosh.CatInformation();
        minnosh.start();

        minnosh.CatInformation();
        minnosh.stop();

        minnosh.CatInformation();
    minnosh.accelerate(8);


        System.out.println();
    minnosh.slowDown(5);


    }


}
