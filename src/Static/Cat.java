package Static;

public class Cat {


    static int meowMix = 10;
    int KitKab = 8;

    /* create one method will take int number
    this methos is called eatMix
    once i call the method it will reduce number of
    meowMix
    return type is boolean

    create one method , it will take one int number
    this method is called eatKit
    once i call the method it will reduce number of Kitkab
     return type is boolean

     */

   public static boolean eatMix(int amount) {
       if (amount<=meowMix){
           meowMix-=amount;
           System.out.println(meowMix);
           return true;
       }
        return false;
    }

    public boolean eatKit(int amount){
       if (amount<=KitKab){
           KitKab-=amount;
           System.out.println(KitKab);
       return true;

       }
   return false;
   }

}
