package Arrays;

public class Fruits {
    public static void main(String[] args) {
        String[] fruit1={"banana","apple","orange"};
        String[] fruits2={"carrot","tomato","apple","patato"};

//
//        for (int i=0;i<fruit1.length;i++){
//            for (int k=0;k<fruits2.length;k++){
//                if (fruit1[i].equals(fruits2[k])){
//                    System.out.println(fruit1[i]);
//
//                }
//            }

        for (String f:fruit1){
            for (String f1:fruits2){
                if (f.equals(f1)){
                    System.out.println(f);
                }
            }
        }




















//        for (int i=0;i<fruit1.length;i++){
//            boolean found=false;
//
//            for (int i2=0;i2<fruits2.length;i2++){
//
//                if (fruit1[i]==fruits2[i2]){
//                    System.out.println(fruit1[i]+" its in there !");
//
//                    found=true;
//
//
//
//
//                    }
//
//                }
//            if (found==false){
//                System.out.println(fruit1[i]+" is NOT in there !");
            }

        }











