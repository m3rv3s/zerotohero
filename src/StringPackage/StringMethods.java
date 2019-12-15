package StringPackage;

public class StringMethods {
    public static void main(String[] args) {

        String sName="techtorial";
        int num=1;
        num++;



        System.out.println(sName.toUpperCase());

        System.out.println(sName); //techtorial

        sName=sName.toUpperCase(); //String is assigned again

        System.out.println(sName); //TECHTORIAL

        //difference between primitive data type and string
        //1-String is immutable
        //2-primitive data types are mutable
        //3-String should be reassigned to be able to change

        String student="ARSLAN";

        System.out.println(student.toLowerCase()); // arslan
        System.out.println(student);// will not be change string is immutable ARSLAN

        student=student.toLowerCase();

        student+= " kabul ";
        // = it means assignment in java.
        // == it means is equal to comparison operators

        System.out.println(student);// it will become lower case




    }
}
