package Exceptions;

public class bankAccount {


        public void transaction(int amount) throws Exception{
            System.out.println("Your transaction is over the balance.");
            throw new Exception("New Your transaction is over the balance");
        }

        public void deposit(int amount)throws NullPointerException{
            System.out.println("Your deposit amount is less than $10");
            throw new NullPointerException("New Your deposit amount is less than $10");
        }

        public void withDraw(int amount){
            System.out.println("You are withdrawing more than your balance.");
            throw new RuntimeException("New You are withdrawing more than your balance.");
        }

    }

