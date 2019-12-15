package Exceptions;

public class CreditCard extends bankAccount {



    @Override
    public void transaction(int amount)throws Exception{
        System.out.println("Your crossing credit card limit");
        throw new Exception("New Your crossing credit card limit");
    }
    @Override
    public void deposit(int amount)throws NullPointerException{
        System.out.println("Paying off my balance");
    }
    @Override
    public void withDraw(int amount)throws RuntimeException{
    System.out.println("Iam withdrawing money");


        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


