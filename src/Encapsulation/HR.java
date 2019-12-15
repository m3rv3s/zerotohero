package Encapsulation;

public class HR {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setFistname("Merve");
        employee.setLastname("Senel");
        employee.setAge(25);
        employee.setEmployeeID("AS23456");
        employee.setGender('F');
        employee.setSalary(120000);
        employee.setSSN(123456789);
        System.out.println(employee.getAge());

        //encapsulation is a hiding a data and giving
        // them access through getter and setter
    }
}
