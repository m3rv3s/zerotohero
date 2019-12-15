package StringBuilderPractice;

import java.util.Arrays;

public class StringBuilderPrac {

    public static void main(String[] args) {
        StringBuilder table=new StringBuilder();

        StringBuilder table1=new StringBuilder("Rockwell");
        System.out.println(table);//it will be empty

        System.out.println(table1);

        //dynamic polymorphism --> java doesn't know which method to call until running
        //at runtime java will select method according to you parameter.


        //append--->sonuna eklemek

        table.append("Ikea");
        System.out.println(table);
        table.append(10);
        System.out.println(table);//ikea10

        String name="ikea";
        name.concat("10");
        System.out.println(name); //ikea

        table1.append(10.4);
        System.out.println(table1); //rockwell10.4

         StringBuilder tree=new StringBuilder("oak");
         StringBuilder tree1=new StringBuilder("oak").append(" 14");
        System.out.println(tree);
        System.out.println(tree1);
        
       char nm=tree.charAt(0);
        System.out.println(nm);
        System.out.println(tree);
   /*return type should be substring.
   if you call the method and return
   type is stringbuilder in this case
   your original string builder
   value will change.   */
       int index=tree.indexOf("k");
        System.out.println(index);



         StringBuilder apple=new StringBuilder("Aple");
                apple.insert(2,"p");
                System.out.println(apple);// Apple
                apple.insert(5,"s number is 10");
                System.out.println(apple);

        System.out.println("***********************");

              StringBuilder [] builders={tree,tree1,apple};

              builders[0].insert(2,"-");
              builders[1].insert(2,"-");
               builders[2].insert(2,"-");

        System.out.println(builders[0]);
        System.out.println(builders[1]);
         System.out.println(builders[2]);

         for (StringBuilder b:builders){
              System.out.println(b);
         }

        System.out.println(Arrays.toString(builders));

        System.out.println("*******Deleting*********");

        StringBuilder mouse=new StringBuilder("microsoft ");

        mouse.delete(0,3);

        System.out.println(mouse);

        mouse.deleteCharAt(2);
        System.out.println(mouse);

        System.out.println("*******Reversing********");

         mouse.reverse();
        System.out.println(mouse);


        System.out.println("*******String********");

    String mouse1=mouse.toString();
    String mouse2=mouse.substring(0);

    String mouse3="mouse";
        System.out.println(mouse3);


    }









}
