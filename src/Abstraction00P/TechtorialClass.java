package Abstraction00P;

public class TechtorialClass {
    public static void main(String[] args) {
       // student sstudent=new student() ;

        campusStudent cs=new campusStudent();

        cs.attendClass();


        System.out.println("");

        System.out.println("------after we call the other class ----------");
        System.out.println("");

        OnlineStudent os=new OnlineStudent();
        os.attendClass();
        os.homework();

        /* IMPORTANT:
        we cannot instantiate ( create an object ) abstract class.
        ----> Whats the rules of overriding?

         */


            }
        }

