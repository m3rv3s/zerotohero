package Methods;

public class Dog {


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
    String color;
    String kind;
    int speed;
    int age;
    boolean isRunning;

    public boolean start(){
        isRunning=true;
        return isRunning;
    }

    public boolean stop(){
        isRunning=false;
        return isRunning;
    }

    public void run(String Direction){
        System.out.println("the dog is runnning" + Direction);

    }
    public void dogInformation(){

        System.out.println("Dog Name is :" + name);
        System.out.println("Dog type is : " + kind);
        System.out.println("Dog color is :" +color);
        System.out.println("Dog speed is: " + speed);

    }
    public void accelerate(int targetSpeed){
        int currentSpeed=speed;

        if (currentSpeed<=targetSpeed){
            System.out.println(currentSpeed);
            speed=currentSpeed;
            currentSpeed++;
        }}
        public void slowDown(int targetSpeed){
            for (int i=speed;speed>targetSpeed;i--){
                System.out.print(i);
                speed=i;
        }}

    public static void main(String[] args) {
        Dog d=new Dog();

        d.name="Cakil";
        d.kind="Husky";
        d.age=1;
        d.color="white";

        d.dogInformation();
        d.start();

        d.dogInformation();
        d.stop();

        d.dogInformation();
        d.accelerate(8);

        System.out.println();

        d.slowDown(5);



        }
    }

