package Practice;



public class Practice12 {

    public String function(String [] arr){
            String name="";

            for (String s:arr){
                name+=s;


            }
        return name;
        }
        public static void main(String[] args) {

        Practice12 pr=new Practice12();
            String [] str={"Tech", "2019","Coding"};

            System.out.println(pr.function(str));}



}