package Constructor;



public class ComputerTest {

    public static void main(String[] args) {

        Computer c=new Computer(); //no arguments constructor

        Computer c1=new Computer("apple","OS","MacBook " ,"Pro");

        //immutable class
        //my instance variables should be private
        //i need to create only getters
        //we need set the value for using the constructor



        Computer c2=new Computer(2015,8,14);

        System.out.println(c.getName());
        System.out.println(c.getYear());

        c.setName("HP");
        System.out.println(c.getName());
        System.out.println(c.getYear());

        c.setName("acer");
        System.out.println(c.getName());
        System.out.println(c.getYear());

        System.out.println(c2.getYear());
        System.out.println(c2.memory);
        System.out.println(c.memory);
        c.memory=12;
        System.out.println(c.memory);

        Computer[] computer={new Computer(),new Computer(), c , c1,c2};
        System.out.println(computer[2].memory);



    }


}
