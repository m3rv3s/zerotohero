package WrapperClass;

public class WrapperClassPrac {

    public static void main(String[] args) {

        /*important this related with byte and short:
       * once you created an object from byte and short you need to cast them.

         */


        Byte by=new Byte((byte)12);

        Short sh=new Short((short)20);

        Integer in=new Integer(50);

        Long ln=new Long(4592);

        Double db=new Double(50.9);

        Float fl=new Float(43.89);

        Boolean bl=new Boolean(true);

        Character ch=new Character('P');

        Byte by1=new Byte("12");
       Short sh1=new Short("44"); // even though i gave value as a String
        // java will convert them to the object


        System.out.println(by1);
        System.out.println(sh1);

        //Third way
        Integer num=198;
        Short num1=54;
        //if you provide the number directly without new keyboard.
        // You dont need to cast.


        /*what is the difference between object and primitive data types:

        in object we can call the methods

        but in primitive you dont have method.
        ---------------------------------------
        what is the instance of the class?
        it is object from the class.
        ---------------------------------------
        byte i;
        i=50; ---> initialization of the primitive date types
        ------------------------------------------------------
        Boolean bl=new Boolean (

         */

        int number=55;
        Integer computers=null;
       // number=computers; // it wont give you compile time error however
        // it will give you runtime.
        System.out.println(number);

        //converting from String to Primitive data types.

        String values="455";
        int valueint=Integer.parseInt(values);
        System.out.println(valueint);
        String convertBl="123";
        boolean convert=Boolean.parseBoolean(convertBl);
        System.out.println(convert);
        //  if you are converting String value of boolean to th eprimitive, all values other than trua or false, itbwill assign as a false;
        String intValue="900";
        int vl=Integer.parseInt(intValue);
        System.out.println(vl==900);
        //Converting String to Object
        String table="ture";
        Boolean tb= Boolean.valueOf(table);
        System.out.println(tb);
        String chair="C";
        Character ch1='C';

        Character ch2=new Character('C');
        Integer phone=Integer.valueOf("12.56");
        System.out.println(phone);

        // since the value is double it will give NUmberFormatException

        int mouse=6;
        Integer mouse1=mouse;


        // mouse primitive is assigned as a wrapper class object.
        //autoBoxing is automatic conversion from primitive to wrapper class object.
        // autoboxing is for every primitive data types.

        System.out.println(mouse1);

        char c='K';
        Character cr=c; //it is autoboxing

        boolean b=true;
        Boolean bn=b; // it is autoboxing

        Float ft=15.10f;
        float ft1=ft; //java automatically convert from objects to the primitve.
        //it is called unboxing

        Double money=10000.99;

        double money1=money; // it is unboxing

       /* autoboxing primitive to object
                unboxing is object to primitive
               unboxing can be apply for all primitive data types.
               */






    }
}
