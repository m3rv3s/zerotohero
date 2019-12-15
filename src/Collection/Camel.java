package Collection;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Camel {

/* TASK:
Using Hashmap create one camel list
Every camel has diff animalid String "1r34r"
Store 5 different camel with their name
Create one method it will not take any parameter.
It will print only Camels if the id is starting with 1
*/

    public static void main(String[] args) {
        HashMap<String , String> camelList=new HashMap<>();

        camelList.put("12E23","Dodo");
        camelList.put("12W45","Prenses");
        camelList.put("23Q234","Hashmet");
        camelList.put("35F123","minnosh");
        camelList.put("123r45" , "Camel5");

        getName(camelList);

        System.out.println(camelList.entrySet());

        System.out.println(camelList.containsValue("minnosh"));
        System.out.println(camelList.containsKey("23Q234"));
        System.out.println(camelList.containsKey("12t564"));


        HashMap<String, String> camellist1=new HashMap<>(camelList);
        System.out.println(camelList);

        System.out.println(camelList.equals(camellist1));


        //clear method will delete all the information.


    }
    public static void getName(Map <String,String> map){

        Set<String> camel= map.keySet();

        for (String c: camel){
            if (c.startsWith("1")){
                System.out.println(map.get(c));
            }
        }

    }






}
