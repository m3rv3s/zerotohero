package Practice;

public class FindingNumbers {

    public static void main(String[] args) {


        String name="Tech1to5ri3al";

        for (int i=0;i<=name.length()-1;i++)

            for (char ch='0';ch<='9';ch++){


            if (name.charAt(i)==ch){


                System.out.println(ch);

            }

}

    }
}
