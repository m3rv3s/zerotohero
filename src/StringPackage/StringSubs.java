package StringPackage;

public class StringSubs {

    public static void main(String[] args) {

        String patientInfo="45 - walnut - Jessica";
        System.out.println(patientInfo.substring(5));
        System.out.println(patientInfo.substring(5,11));
        System.out.println(patientInfo.substring(5,5));
        // patientInfo.substring(5,4
        //--> java will throw the exception.(runtime error).

        System.out.println(patientInfo.length());

        //length is 21
        //last index number is 20
        //patiendInfo.substring(5,24); ---> it will throw a exception
        System.out.println(patientInfo.substring(5,21));

    }

}
