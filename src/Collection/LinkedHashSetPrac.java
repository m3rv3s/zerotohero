package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetPrac {

    public static void main(String[] args) {


        LinkedHashSet number = new LinkedHashSet();

        number.add(10);
        number.add(30);
        number.add(20);

        System.out.println(number);

        /*
         linkedhashset follows the insertion order -- everything is same with Hashset except order. all the method
        which set has , we can use in the linkdhshst.

        Hashset-does not follow the order

        set names=new LinkedHashSet();
         */

        System.out.println("*******TreeSet Method*******");

        TreeSet<String> eventAttendanceList = new TreeSet<>();

        eventAttendanceList.add("mike");
        eventAttendanceList.add("jenn");
        eventAttendanceList.add("john");
        eventAttendanceList.add("kevin");
        eventAttendanceList.add("jess");
        // eventAttendanceList.add(null); --> you cannot add null value.NullPointerException
        System.out.println(eventAttendanceList);

        /*
        treeset follows ascending order.

         */
        System.out.println("****************** DescendingIterator ******************");

        Iterator<String> i=eventAttendanceList.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next() + "");
        }


        System.out.println();
        System.out.println(eventAttendanceList);
        eventAttendanceList.pollFirst();
        System.out.println(eventAttendanceList);
        eventAttendanceList.pollLast();
        System.out.println(eventAttendanceList);





    }




}
