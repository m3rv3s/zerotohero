package Collection;

import java.util.TreeMap;

public class TreeMapPrac {

    public static void main(String[] args) {

        TreeMap<String, String> phoneList=new TreeMap<>();
        phoneList.put("Muammer","12345678");
        phoneList.put("david" , "23456676");
        phoneList.put("Kevin","21345324");
        phoneList.put("james",null);
        System.out.println(phoneList);


        /*
        it does not allow to store the null key but you can store null values.
        it follows ascending order,
        it will look at the key and according values of key it will do ascending order
         */





    }



}
