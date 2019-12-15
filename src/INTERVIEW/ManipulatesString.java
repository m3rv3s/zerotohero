package INTERVIEW;

import java.util.ArrayList;

public class ManipulatesString {

    /*
    Create instance a filled called mainString
    create constructor with no arg
    crt constructor w/ one arg and initialize the main String

    method:
    crt mthod called sumNumber()
    take no parameter and it will get the sum of num foind in String
    if there no num present in String it will return 0

    Method2:
    crt mthod called getLetterList()
    take no parametr and it will return the list of cha present in String
    Store letters to the arraylist and return the array list.
    note: do not store the num present in String.

    Crt class called StringManipulateStringTest w/ main method
    call the method with Class name.
    crt one object and caall the methods.
     */

    String mainString;

    public ManipulatesString() {
    }
    public ManipulatesString(String mainString) {
        this.mainString = mainString;
    }

    public int sumNumber() {
        int sum = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (Character.isDigit(mainString.charAt(i))) {
                String ch=String.valueOf(mainString.charAt(i));
                int num=Integer.parseInt(ch);
                sum += num;
            }
        }
         return sum;
    }

    public ArrayList<Character> getLetterList(){
        ArrayList<Character> letterList=new ArrayList<>();

        for (int i=0;i<mainString.length();i++){
            if (Character.isAlphabetic(mainString.charAt(i))){
                letterList.add(mainString.charAt(i));

            }
        }
    return  letterList;
    }



}

