package Switch;

import java.util.Scanner;

public class STATE {

//using scanner ask the user the State name
    // there are state Illinois , Wisconsin
    // if your input is matching one the states ask them second question
    //enter your city
    //for Illinois  Chicago , Elgin , Streamwood , Schaumburg
    //for Wisconsin Oshkosh , Milwaukee , Madison , Greenbay
    //selected the organization in StateName and cityName
    //selected

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the state Name (Wisconsin or Illinois)");
        String stateName=input.nextLine();
        switch (stateName){
                default:
                    System.out.println("selected state is not available");
                    break;

                    case "Illinois":
                    System.out.println("Please enter the city Name (Chicago, Elgin or Des Plaines)");
                    String cityName=input.nextLine();
                    switch (cityName){
                        case "Chicago":
                            System.out.println("Selected state name "+stateName+" city name "+cityName);
                            break;
                        case "Elgin":
                            System.out.println("Selected state name "+stateName+" city name "+cityName);
                            break;
                        case "Des Plaines":
                            System.out.println("Selected state name "+stateName+" city name "+cityName);
                            break;
                        default:
                            System.out.println("selected city is not available");
                    }
                        break;
            case "Wisconsin":
                System.out.println("Please enter the city name (Oshkosh, Milwaukee , Madison or Greenbay");
                String cityName2=input.nextLine();
                switch (cityName2) {


                    case "Milwaukee":
                        System.out.println("Selected State name " + stateName + " city name " + cityName2);
                        break;
                    case "Oshkosh":
                        System.out.println("Selected State name " + stateName + " city name " + cityName2);
                        break;
                    case "Madison":
                        System.out.println("Selected State name " + stateName + " city name " + cityName2);
                        break;
                    case "Greenbay":
                        System.out.println("Selected State name " + stateName + " city name " + cityName2);
                        break;

                    default:
                        System.out.println("Selected city is not avalaible");

                }
        }

            }
        }



