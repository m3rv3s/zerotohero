package Arrays;

public class StringArrays {

    public static void main(String[] args) {

        String [] words=new String[5];

        words[0]="zero";
        words[1]="one";
        words[2]="two";
        words[3]="three";
        words[4]="four";

        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);

        }
        System.out.println("-----------------------------");

        for (String word:words){
            System.out.println(word);


        }
        System.out.println("-----------------------------");
   int[] nums={100,300,44,32,9,3};

        for (int n:nums){
            System.out.println(n);
        }



    }
}
