package Constructor;

public class Computer {

    /* instance variables is name, operating system , brand , model,year ,memory , inch
    create no arguement constructor
    create 4 argument cons for name, operating system, brand , model
    create 3 argument constructor for year, memory , and inch
    create 7 argument constructor and call 4 argument constructor to initialize the instacne varibales

     */


    //default --> accessible inside same package
    //protected ---> same package + outside of the oackage inside subclass.

    private  String name,operatingSystem,brand,model;
    private int year,inch;
           int memory;

public Computer(){

}
public Computer(String name,String operatingSystem, String brand, String model){  //refering my instance variables

    this.name=name;
    this.operatingSystem=operatingSystem;
    this.brand=brand;
    this.model=model;// if you dont give access for modifier, it is default access
}

public Computer(int syear,int smemory,int sinch){
    year=syear;
    memory=smemory;
    inch=sinch;
}

//to be able to call the instance constructor inside another constructor we are using this keyword.
    //it must be in first line.
    public  Computer(String name,String operatingSystem, String brand, String model,int year,int memory,int inch) {

        this(name, operatingSystem, brand, model);


        this.year = year;
        this.memory = memory;
        this.inch = inch;

//
//      System.out.println("Name is:" + name);
//      System.out.println("Operating System is:" + operatingSystem);
//      System.out.println("Brand  is:" + brand);
//      System.out.println("model is:" + model);
//      System.out.println("year is: " + year);
//      System.out.println("inch is:" + inch);
//      System.out.println("memory is:" + memory);


//Computer computer=new Computer("Apple","")


/*Create a getter and setter for following instance variables
name,operatingsystem , brand ,model
 */
    }
    public String getName() {
            return name;
        }

        public void setName(String name) {

            this.name = name;
        }



            public  void setOperatingSystem(String operatingSystem) {
                this.operatingSystem=operatingSystem;

            }

            public int getYear() {
            return year;

            }
            public void setYear(int year){
                this.year=year;

        }
    }