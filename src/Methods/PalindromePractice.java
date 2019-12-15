package Methods;


public class PalindromePractice {


        /*write method it will one parameter as a number
        it will check  the number is palidrome or not
       if it is palidrome it will true else it will return false
       1221 --> it is palidrome it should return true
       456654 ---> it is plaidrome it should return the
       321 --> it is not palidrome it should return false
       reversed=reversed+1==> formula reversed=reversed*10+remainderOrijinalValue;
        */
        public boolean isPalindrome(int orijinalnum) {
            int temp = orijinalnum;
            int reversed = 0;
            while (temp > 0) {
                int remainderOrijinal = temp % 10; // 1 - 2 - 3
                reversed = reversed * 10 + remainderOrijinal; // 1   // 10+2=12   // 120+3= 123
                temp = temp / 10; // 32/10 = 3
            }
            if (orijinalnum == reversed) {
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            PalindromePractice palindrome = new PalindromePractice();
            boolean result = palindrome.isPalindrome(321);
            System.out.println(result);
        }
    }





    //public int number(int number) {
//
//    int num, temp, remainder, reverse = 0;
//    System.out.println("enter a int number:");
//
//
//    temp = num;
//
//        while (num>0){
//
//            remainder=num%10;
//            reverse=reverse*10+remainder;
//            num /=10;
//
//
//        }
//        System.out.println("given number is " + temp);
//        System.out.println("it reverse is " +reverse);
//
//        if (temp==reverse) {
//            System.out.println("number is a palidrome");
//
//        }else{
//            System.out.println("number is not palidrome");
//        }
//    }
//
//
//
//
//
//}