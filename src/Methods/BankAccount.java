package Methods;

public class BankAccount {

    /* create one class called BankAccount
    there are three instance variable= name, accountNumber, Bankname, balance ( double) , expirationDate
    1-create the method to dsplay all the card information
    2-create the method to deposit the amount to your bank account
    this method will take the int parameter as an amount.
    balance=balance+amount
    3-create a method to withdraw the money from account
    4-it will take one parameter as an withdraw amount.
    It will return the double
     */

            String name;
            String bankname;
            int  accountNumber;
            int  exDate;
            double  balance;

            public  void  DisplayInfo(){

                System.out.println(name);
                System.out.println(bankname);
                System.out.println(accountNumber);
                System.out.println(exDate);
                System.out.println(balance);

    }

    public double deposite(int depositAmount){
                balance+=depositAmount;
                return balance;


            }
public double withdraw(int withdrawAmount){
                balance=balance-withdrawAmount;

                return balance;
}

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();

        ba.bankname="Chase";
        ba.name="Merve";
        ba.accountNumber=93847292;

        ba.exDate=2022;
        ba.balance=10;

        ba. DisplayInfo();

        ba.deposite(1000);

        ba.DisplayInfo();

        ba.withdraw(1500);

        ba.DisplayInfo();
    }






}
