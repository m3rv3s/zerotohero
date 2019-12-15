package Abstraction00P;

public class OnlineStudent extends student {


    @Override
    public void study() {
        System.out.println("online students are studying harder than campus students");
    }

    @Override
  void attendClass() {
        System.out.println("they are attending threw webinar");

    }


}
