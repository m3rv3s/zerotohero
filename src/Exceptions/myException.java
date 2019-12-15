package Exceptions;

public class myException extends RuntimeException{

    public myException(){
        super();
    }
    public myException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
       return "this is my exception's message ";

    }

    public static void main(String[] args) {

        throw new myException("i am throwing my exception");
    }
}
