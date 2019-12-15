package Abstraction00P;

//import Arrays.Students;

public class campusStudent extends student {

    /*
    Important Rules:
    any class tht extends abstract class has to provide implemantation for those methods
    you have to have @Override

     Concrete Class
     *first class tht is extending the abstract class is named as concrete class.

    */
    @Override
    public void study(){
        System.out.println("campus student is studying");

    }
    @Override
    public void attendClass(){
        System.out.println("student is taking class on campus");
    }

    @Override
    public void homework(){
        System.out.println("campus student is doing his/her hw");

    }


}
