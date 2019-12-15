package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPrac {

    public static void main(String[] args) {

        /*
        since set is interface you can not instantiate the set
        Hashset, LinkedHashSet , TreeSet
         */
        Set<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(40);

        System.out.println(numbers);
        /*

        * *Hashset is not allowing to store duplicate elements
        * add method -- first checking the element is stored to the set or not
        * if the value is not stored before it will store the value
        * if the value is already present in the set it will not store.

        */

        Set<Integer> values=new HashSet<>();

        values.addAll(numbers);
        System.out.println(values);
        Iterator<Integer> iterate=values.iterator();

        while (iterate.hasNext()) {

            if (iterate.next() == 20)
                System.out.println(iterate.next());
        }
            for (Integer num: values){
                if (num==20){
                    System.out.println(num);
                }
            }
        System.out.println(values.contains(40));
        System.out.println(values.contains(55));
        values.clear();
        System.out.println("This is after clear method");
        System.out.println(values);
        System.out.println(values.isEmpty());
        System.out.println(numbers);
        numbers.remove(40);
        System.out.println(numbers);
        }


    }

