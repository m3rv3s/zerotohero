package Variables;

public class LogicalOperators {

        public static void main(String[] args ){

            boolean hasTicket=false;
            boolean hasVisa=true;

            boolean canCome=hasVisa&&hasTicket;

            System.out.println("Can i come to the USA "+canCome);


            boolean finishedESL=false;
            int ToeflScore=80;
            boolean passToefl=ToeflScore>=79;

            boolean canGoToCollege=finishedESL||ToeflScore>=79;

            System.out.println("Can go to College "+canGoToCollege);




            int currentMoney=200_000;
            int homePrice=300_000;

        boolean hasMortgage=true;

        boolean hasEnoughMoney=currentMoney>=homePrice;
        boolean canBuyHome=hasMortgage || hasEnoughMoney;

        System.out.println("Can i buy the home?" + canBuyHome);


        }




}
