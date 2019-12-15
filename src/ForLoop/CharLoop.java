package ForLoop;

public class CharLoop {

    public static void main(String[] args) {


       //all primitive data types we cannot use the String methods//
       //char a='a'; char b='b'; a==b
        //String a="a"; String b="b":a.equalsTo(b);

        for (char ch='A';ch<='Z';ch++){
            System.out.print(ch+",");
        }
    }
}
