package ForLoop;

public class ReverseString {
    public static void main(String[] args) {



//        palidrome:


        String name="merve";
        String reverse="";

        // for loop
        // after for loop print the reverse="remmaum"


        for (int i=name.length()-1;i>=0;i--){

            reverse+=name.charAt(i);



            }
            if (name.equals(reverse)){
                System.out.println(name +" it is a palidrome word");

            }else{
                System.out.println("not a palidrome word");


            }

        System.out.print(reverse);



    }
}
