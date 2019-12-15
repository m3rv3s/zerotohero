package HomeWork;

public class ArrayListStrInt {
/*TASK
Create the one method,
it will take the string as a parameter and it will return
the Wrapper integer value from the string
 */
public static void main(String[] args) {

        String num1="2106";
        int numInt=Integer.parseInt(num1);
        System.out.println(numInt);

        ArrayListStrInt m=new ArrayListStrInt();
    System.out.println(m.getString("15"));
}

public int getString(String output){
    int n=Integer.parseInt(output);
    return n*n;
}


}







