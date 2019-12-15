package Switch;

import java.util.Scanner;

public class DowntownOffice {

    //downtown office has 50 floor
    // 30th floor there are three companie ( walgreens , cvs , discover)
    // 31st floor there are two companies (Techtorial , bluecross)
    //total number of elevator is 6
    // elevator : which floor do you wanna go
    // which company would you like to go to
    //walgreens - enter elevator 1
    //cvs - elevator number 2
    // disco- elevator 3
    // tech- elevator 4
    //bluec- elevator 5

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select the floor 30 or 31");
        int floorNum = input.nextInt();
        switch (floorNum) {


            case 30:
                System.out.println("Please select the company : Walgreens , CVS , Discover ");
                String companySelec=input.next();
                switch (companySelec) {


                    case "Walgreens":
                        System.out.println("Selected Floor " + floorNum + " is Selected Company is " + companySelec + "Please enter elevator 1 ");
                        break;
                    case "CVS":
                        System.out.println("Selected Floor " + floorNum + " is Selected Company is " + companySelec + "Please enter elevator 2 ");
                        break;
                    case "Discover":
                        System.out.println("Selected Floor " + floorNum + " is Selected Company is " + companySelec + "Please enter elevator 3 ");
                        break;
                    default:
                        System.out.println("selected floor and company is not avalaible");

                }

                    break;
                        case 31:
                        System.out.println("Please select the company : Techtorial or Bluecross ");
                        String companySelec1=input.next();
                        switch (companySelec1){

                            case "Techtorial":
                                System.out.println("Selected Floor "+ floorNum + " is Selected Company is " +companySelec1 + "Please enter elevator 4 " );

                                break;

                                case "Bluecross":
                                System.out.println("Selected Floor "+ floorNum + " is Selected Company is " +companySelec1 + "Please enter elevator 5 " );
                                break;
                        }

        }
    }}