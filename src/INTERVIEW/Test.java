package INTERVIEW;

public class Test {

    public static void main(String[] args) {


        ProgrammerTeacher teacher = new ProgrammerTeacher();
        teacher.addLanguages("Java");
        Program programmer=new Program();
        //teacher.teach(programmer,"Java");

        System.out.println(teacher.teach(programmer,"Java"));

        System.out.println(teacher.teach(programmer,"Phyton"));


    }
}
