package Variables;

class UneryOperators {

    public static void main (String[] args){

        int studentAge=25;
        studentAge++;

        System.out.println(studentAge);

        studentAge++;
        //26
        studentAge--;
        //25

        studentAge=2*studentAge++;

        System.out.println(studentAge);

        int x=3;
        int k=++x*5/x--+--x;


        System.out.println(x);
        System.out.println(k);


    }


}


