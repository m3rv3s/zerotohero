package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {


        List<String> birdlist = new ArrayList<String>();

        birdlist.add("Owl");
        birdlist.add("Parrot");
        birdlist.add("Penguin");

       Object [] listofBird=birdlist.toArray();
       //toarray method  will return to array .The array type is object.

        List<Integer> number=new ArrayList<>();

        number.add(10);
        number.add(11);
        number.add(55);

       Object[] numlist= number.toArray();
       //if you are converting from arraylist to array using toarray method
        // you can only store as a object of the array, because
        //toArray () ; method will return to object.
       ////////////////////////////////

        String [] city={"Chicago","New York","San Francisco"};

        System.out.println(city.length);

        List<String> cityNames= Arrays.asList(city);

        System.out.println(cityNames.size());

        //cityNames.add("Los Angeles");

        System.out.println(cityNames.size());
        //if regularly Arraylist is not fixed size. However if you convert
        // from Array to Arraylist size will be fixed .

        List<String> cityNames1=new ArrayList<>(cityNames);
        System.out.println(cityNames1.get(0));
    cityNames1.add("Los Angeles");
        System.out.println(cityNames1);

        System.out.println("----------------------");

        for (int i=0;i<cityNames1.size();i++){
            cityNames1.set(i,cityNames1.get(i).toUpperCase());

            }
        System.out.println(cityNames1);

        }

    }


