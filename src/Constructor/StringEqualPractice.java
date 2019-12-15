package Constructor;

import org.w3c.dom.ls.LSOutput;

public class StringEqualPractice {


    public static void main(String[] args) {


    String student="David";
    String student1="David";
        String student3="David";
    System.out.println(student==student1);


    String student2=new String ("david");

    System.out.println(student==student2);

    student=student2;

        System.out.println(student==student2);

        student1=student1+ "";  //because we have ("") this we signed student1 as empty and because of this.

        System.out.println(student1==student3); // this will turn false.




    }
}
