package Constructor;

public class NumberPractice {



    public int multiply(int num){
       return num*10;
    }

    public static void main(String[] args) {
        int appleNum=10;
        NumberPractice apple=new NumberPractice();

        apple.multiply(appleNum);
        System.out.println(appleNum);

        appleNum=apple.multiply(appleNum); //since method took the copy of the appleNumber
//apple number value is not changing
        System.out.println(appleNum);

    }
}
