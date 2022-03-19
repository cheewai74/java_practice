package Basic.Account;

public class CashRegister {

    private double purchase;
    private double payment;

    public static final double QUATER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    /**
     *  Constructs a cash register with no money in it.
     */
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    /**
     * Records the sale of an item.
     * @param amount the price of the item
     */
    public void recordPurchase(double amount){
        double newTotal = purchase + amount;
        purchase = newTotal;
    }

    /**
     * Enters the payment received from the customer
     * @param amount the amount of the payment
     */
    public void enterPayments(double amount){
        payment = payment + amount;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */
    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public void enterPayments(int dollars, int quaters, int dimes,
                             int nickels, int pennies){
        payment = dollars + quaters * QUATER_VALUE + dimes * DIME_VALUE
                + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }
}
