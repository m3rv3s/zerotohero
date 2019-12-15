package StringPackage;

public class MethodChaining {

    public static void main(String[] args) {

        String city="Des Plaines";

        System.out.println(city.substring(4).toUpperCase().replace("P","T").trim());

        System.out.println(city.indexOf("P"));
        //after flowwing method we can do method chaining
        //substring. touppercas.lowercase.replace.trim
        //after following methods we cannot do method chaining
        //length, charat,indexof,contains, equalsignorecase, startwith, endwith
        //      number,char,number,true/false,


    }
}
