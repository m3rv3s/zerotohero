package Collection;

public class Child {
    //    TASK
//
//    Create one child class having name, age, gender, city as private instance variables
//

//
//    Create the method will check the name of the Child, if child name is Palindrome it will return true or it will return false.
//
//    Create one Child test class.
//
//    Creaat five different object of Child. two child name will be palindrome.
//
//    Store all the child to the LinkedHashMap, 1,2,3


    private String name;
    private String city;
    private int age;
    private char gender;

    public Child(String name, String city, int age, char gender) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }


    //    Crate the method it will check the child can go to school or not.
//    If the age is more 6 then child can go to the school or can not go.
//    This method will true/ false

    public boolean goToSchool(){
        if(age>6){
            System.out.println("Child can go to school");
            return true;
        }
        System.out.println("Child can not go to school");
        return false;
    }

    // How do you find String is palindrome or not
    // original=civic , reversed=civic
    // original David, reseved=divad
    // original=JavaVirtualMachinesJ , reversed=sen.....

    public boolean isPalindrome(String str){

        int k=str.length();
        for(int i=0;i<k/2;i++){

            if(str.charAt(i)!=str.charAt(k-i-1)){

                return false;
            }
        }

        return true;
    }





}