package HomeWork;

public class TrueFalseWArray {

    public static void main(String[] args) {

        /* Given an array of ints, print true if array contains 1 and 2,
         otherwise print false.
          Arrays are:Int[] nums1={1, 2, 3, 4};
          Int[] nums2={7, 1, 5, 3, 4, 9};
          Int[] nums3={1, 2};
          Output: true, false, true
         */

        int[] nums1 = {1, 1, 3, 4,9,8,2};
        int[] nums2 = {7, 1, 5, 3, 4, 9};
        int[] nums3 = {1, 2};
        boolean check1 = false;
        boolean check2=false;


        for (int i:nums1){
            if (i==1){
                check1=true;
            }}
        for (int m:nums1){
            if (m==2){
                check2=true;

            }
        }

        if (check1&&check2){
           System.out.println("true");
       }
       if (!check1 || !check2){
           System.out.println("false");
       }

        System.out.println("----------------");
          boolean check3=false;
          boolean check4=false;
       for (int k:nums2){
           if (k==1){
               check3=true;
           }
       }
            for (int a:nums2){
                if (a==2){
                    check4=true;
                }
            }
            if (check3&&check4){
                System.out.println( "true");
            }
            if (!check3||!check4){
                System.out.println("false");
            }
        System.out.println("-----------------");
             check1=false;
            check2=false;

            for (int b:nums3){
                if (b==1){
                    check1=true;
                }
            }

            for (int c:nums3){
                if (c==2){
                    check2=true;
                }
            }
            if (check1&&check2){
                System.out.println("true");

            }
            if (!check1||!check2){
                System.out.println("false");
            }

    }}



    /*
    boolean result=false;
    label: for (int i=0; i<nums1.length;i++){
    if (nums1[i]==1){
    for(int i2=0; i2<nums1.length; i2++){
    if(nums1[i2]==2){
    result=true;
    break label;

    }}}}
        sout(result);

        }}







     */