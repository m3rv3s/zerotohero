package Practice;

public class practice23 {

    public static void main(String[] args) {
        String reverse="";
        String name="abdullah";
        for (int i=name.length()-1;i>=0;i--){
            reverse=reverse+ name.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(name.charAt(4));
    }
}
