package StringBuilderPractice;

public class StringBuilderPractice {
    //"GAMDKJDHO2UY658HFE7KN12BL39KGAE"
    // D E F G
    public void checkBuilder(StringBuilder builder){
        StringBuilder bl=new StringBuilder();
        for(int i=0;i<builder.length();i++){
            char letter=builder.charAt(i);
            if(letter>='D' && letter<='G'){
                bl.append(letter);
            }
        }
        bl.replace(2,4,"SS");
        System.out.println(bl);
    }
    public static void main(String[] args) {
        StringBuilderPractice pr=new StringBuilderPractice();
        pr.checkBuilder(new StringBuilder("GAMDKJDHO2UY658HFE7KN12BL39KGAE"));
    }
}