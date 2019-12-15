package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensinal {
    public static void main(String[] args) {
        String [] [] groupedNames={{"Adilet" , "Aimira" , "Arslan" , "Aiturgan" ,"Akylai","ayka"},{"Nazira","Yasemin","vitalii","nargiza","Sema"}};

        Scanner input=new Scanner(System.in);
        String name=input.next();

        for (int i=0; i<groupedNames.length;i++){
            for (int a=0; a<groupedNames[i].length;a++){
                Arrays.sort(groupedNames[i]);

                if (groupedNames[i][a].equalsIgnoreCase(name)){
                    System.out.println( Arrays.toString(groupedNames[i]));

                    System.out.println("In array " +i+ " in order " + a );
                }

            }
        }
    }
}
