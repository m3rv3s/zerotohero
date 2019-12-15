package Abstraction00P;

public abstract class student {
    int studentId;
    String studentName;

    public abstract void study();

    abstract  void attendClass();

    public  void homework(){
        System.out.println("i have to do my hw before coming to class !");
    }

}
