package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPrac {
    public static void main(String[] args) {

        //it will follow insertion order.
        Map<Integer,String> studentList=new LinkedHashMap<>();
        studentList.put(1,"Muammer");
        studentList.put(2,"Merve");
        studentList.put(3,"Nargiza");

        System.out.println(studentList);




    }
}
