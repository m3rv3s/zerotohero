package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args) {
        Map mapList = new HashMap();

        Map<Integer, String> employeeList = new HashMap<>();
        employeeList.put(1234, "Muammer");
        employeeList.put(12345, "David");
        employeeList.put(123456, "Kushal");
        employeeList.put(1234567, "Priyanka");
        employeeList.put(1235, "Priyanka");
        employeeList.put(1235, "Sameer");

        //i can store same values
        //but key should be unique
        //if you provide the same key with diff value
        //it will update the value

        System.out.println(employeeList);

        HashMap<Integer, String> ticketMasterEmp = new HashMap<>();
        ticketMasterEmp.putAll(employeeList);

        //get method it will get the key as a value and parameter and will

        String empName = ticketMasterEmp.get(1234);
        System.out.println(empName);

        ticketMasterEmp.remove(123456);
        System.out.println(ticketMasterEmp);

        //method called keyset(), it will return set of all the keys from map

        Set<Integer> empIds = ticketMasterEmp.keySet();
        for (Integer id : empIds) {

            System.out.println("Name of the employee is: " + ticketMasterEmp.get(id));

        }
        for (Integer id : empIds) {


            System.out.println("Name of the employee is: " + id);

        }


    }}
