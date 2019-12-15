package StringPackage;

public class StringEquals {

    public static void main(String[] args) {



        String company="TransUnion";
        System.out.println(company.equals("transunion"));

        //for primitive data types we are using logical operator
        //== , >= , <= , !=
        // string to be able to compare the values we are using
        //startw/ , endw/ , equals , contains

        System.out.println(company.equalsIgnoreCase(("TRANSUNION")));

    }
}
