package Arrays;

public class Label {

    public static void main(String[] args) {


        for (int i=0; i<10 ; i++){

            if ( i == 3 ){
                break;
            }
            System.out.println(i);


        }
        System.out.println("-------------------");


        outer: for (int i=0; i<10;i++){
             System.out.println("*");
             for (int j=1; j<5; j++){
                 System.out.print("0");
                 if (j==2){
                     break outer;



                 }
             }
        }
    }
}
