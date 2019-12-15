package Methods;

public class Investment {

    double years;
    double amount;
    double rate;

    public double rateAmount(){
        return amount * rate *years/100;
    }

    public double totalAmount(){
        return rateAmount() + amount;

}
}
