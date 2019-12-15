package Collection;

import java.util.LinkedHashMap;
import java.util.Set;

public class ChildTest {

    public static void main(String[] args) {

        Child child1=new Child("civic", "Chicago", 10,'M');
        Child child2=new Child("mom", "Chicago", 5,'F');
        Child child3=new Child("David", "Ohio", 6,'M');
        Child child4=new Child("Jennifer", "Iowa", 3,'F');
        Child child5=new Child("John", "Des plaines", 1,'M');

        System.out.println(child1.getName());

        LinkedHashMap<Integer,Child> childMap=new LinkedHashMap<>();

        childMap.put(1,child1);
        childMap.put(2,child2);
        childMap.put(3,child3);
        childMap.put(4,child4);
        childMap.put(5,child5);

        Set<Integer> keyList=childMap.keySet();

        for(Integer c:keyList){

            System.out.println(childMap.get(c).getName());
            System.out.println(childMap.get(c).goToSchool());
            System.out.println(childMap.get(c).isPalindrome(childMap.get(c).getName()));
        }

    }
}