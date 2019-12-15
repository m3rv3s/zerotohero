package Projects;

import java.util.Scanner;
import java.util.Scanner;
public class Musicbox2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Classical, Pop and Country 5 different songs for every type of music. So, total we have 15 songs.
        System.out.println("Please Enter Music Type");
        String musicTaype = in.nextLine();
        //CLASSICAL MUSIC PART
        if (musicTaype.equalsIgnoreCase("Classical")) {
            System.out.println("** FourSeasons, FurElise, Finlandia, Vocalise, ThePlanets ** \n" +
                    "is available music under CLASSICAL music \n" +
                    "Please enter  $2 and  select music.");
            int money1=in.nextInt();
            //FIRST PART
            if(money1>=2) {
                System.out.println("You Paid : $"+(money1-2)+" more Please wait for change.");
                System.out.println("Please enter songs name :");
                String clasMuType = in.next();
                if(clasMuType.equalsIgnoreCase("FourSeasons")){
                    System.out.println("FourSeasons is playing...Enjoy with the music!");
                }else if(clasMuType.equalsIgnoreCase("Fur Elise")) {
                    System.out.println("FurElise is playing...Enjoy with the music!");
                }else if(clasMuType.equalsIgnoreCase("Finlandia")) {
                    System.out.println("Finlandia is playing...Enjoy with the music!");
                }  else if(clasMuType.equalsIgnoreCase("Vocalise")) {
                    System.out.println("Vocalise is playing...Enjoy with the music!");
                }else if(clasMuType.equalsIgnoreCase("ThePlanets")) {
                    System.out.println("The Planets is playing...Enjoy with the music!");
                }else { System.out.println(clasMuType+" is not available");}}
            else{
                System.out.println("You Enter $"+money1+" You need  $"+(2-money1)+" more");
                System.out.println("$"+(money1)+" is not enough,please try later");
            }
        }
////POP MUSIC PART
        else if(musicTaype.equalsIgnoreCase("Pop")){
            System.out.println("** Badguy, Talk, PleaseMe, 7Ring, WithoutMe ** \n" +
                    "is available music under POP music \n" +
                    "Please enter  $4  and  select music.");
            int money2=in.nextInt();
            //SECOND PART
            if(money2>=4) {
                System.out.println("You Paid : $"+(money2-4)+" more Please wait for change.");
                System.out.println("Please enter songs name :");
                String popMuType = in.next();
                if(popMuType.equalsIgnoreCase("Badguy")){
                    System.out.println("Badguy is playing...");
                }else if(popMuType.equalsIgnoreCase("Talk")) {
                    System.out.println("Talk is playing...Enjoy with the music!");
                }else if(popMuType.equalsIgnoreCase("PleaseMe")) {
                    System.out.println("PleaseMe is playing...Enjoy with the music!");
                }  else if(popMuType.equalsIgnoreCase("7Ring")) {
                    System.out.println("7Ring is playing...Enjoy with the music!");
                }else if(popMuType.equalsIgnoreCase("WithoutMe")) {
                    System.out.println("TWithoutMe is playing...Enjoy with the music!");
                }else { System.out.println(popMuType+" is not available");}}
            else{
                System.out.println("You Enter $"+(money2)+" You need  $"+ (4-money2)+" more");
                System.out.println("$"+(money2)+" is not enough,please try later");
            }
//COUNTRY MUSIC PART
        }else if(musicTaype.equalsIgnoreCase("Country")) {
            System.out.println("** MeanttoBe, Heaven, Simple, OneNumberAway, GetAlong ** \n" +
                    "is available music under COUNTRY music \n" +
                    "Please enter  $3  and  select music.");
            int money3=in.nextInt();
            //THIRD PART
            if(money3>=3) {
                System.out.println("You Paid : $"+(money3-3)+" more Please wait for change.");
                System.out.println("Please enter songs name :");
                String coMuType = in.next();
                if(coMuType.equalsIgnoreCase("MeanttoBe")){
                    System.out.println("MeanttoBe is playing...Enjoy with the music!");
                }else if(coMuType.equalsIgnoreCase("Heaven")) {
                    System.out.println("Heaven is playing...Enjoy with the music!");
                }else if(coMuType.equalsIgnoreCase("Simple")) {
                    System.out.println("Simple is playing...Enjoy with the music!");
                }  else if(coMuType.equalsIgnoreCase("OneNumberAway")) {
                    System.out.println("OneNumberAway is playing...Enjoy with the music!");
                }else if(coMuType.equalsIgnoreCase("GetAlong")) {
                    System.out.println("GetAlong is playing...Enjoy with the music!");
                }else { System.out.println(coMuType+" is not available");}}
            else{
                System.out.println("You Enter $"+money3+" You need   $"+(3-money3)+"  more");
                System.out.println("$"+(money3)+" is not enough,please try later");
            }
        }else{ System.out.println(" Available music types are \n \n" +
                " ***  Classical\n" +
                " ***  Pop \n" +
                " ***  Country \n \n" +
                musicTaype+ " TYPE OF MUSIC is not available !!!"); }
    }}

