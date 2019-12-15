package StringPackage;

public class StringAdvanced{


        public static void main(String[] args) {
            // initialize the name
           // String name = "Muammer";
            // re-assigning the name
           // name = "Arslan";
            //String sName = name + " Ali";
            //System.out.println(name); // Arslan
            ///System.out.println(sName);// Arslan Ali
            //String computerName = "Mac Pro";
            //System.out.println(computerName + " 2019"); //Mac Pro 2019
            //computerName = computerName + " 2019";
            //System.out.println(computerName); // Mac Pro 2019
            //String schoolName = "Techtorial";
            // length() will return number of the char in String.
            // result will be int
            //System.out.println("String length is " + schoolName.length());
            //String fullName = schoolName + " Academy";
            //System.out.println("Fullname length is " + fullName.length());
            //String userName = "techtorialaaaaaaammfjrmrmfjlkjfds;lkjf;alsf;lasdjf;lasdjf'askljdf mamdfmfq";
            //int l = userName.length();
            //System.out.println("username lenght is " + l);
            //System.out.println(userName.charAt(l - 1));
            // In java counting start from the 1
            // In java indexing start from 0
            //System.out.println(userName.charAt(0)); // t
            //System.out.println(userName.charAt(3)); // h
            //System.out.println(userName.charAt(7));// i
            //System.out.println(userName.charAt(9)); // l
            // if you wanna find out last char from the string
            // we need first find out the length of the String
            //System.out.println(userName.charAt(userName.length() - 1));
            // if in the index there is not char, java will throw an exception
            // StringIndexOutOfBoundException
            //int userNameLength = userName.length();
            // System.out.println(userNameLength);


            // middle char

            // a b c d e f g ==> 7  d = 3
            // charAt((length-1)/2)
            // charAt(length-1)

            String animal="Dragon Animal";
            //print find the last char from the animal
            //print the middle char from the string
            //print the first char from the string
            //find the second matching index of 'n' from the string
            //print the length of string
            //print the 20th char
            //print index of 'k'

            System.out.println(animal.charAt(animal.length()-1));
            System.out.println(animal.charAt((animal.length()-1)/2));
            System.out.println(animal.charAt(0));
            System.out.println(animal.indexOf("n",6));
            System.out.println(animal.length());
            System.out.println(animal.indexOf('k'));
            System.out.println(animal.charAt(20));









        }
    }
