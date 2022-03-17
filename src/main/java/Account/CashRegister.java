package Account;

public class CashRegister {

    private double purchase;
    private double payment;

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


}
