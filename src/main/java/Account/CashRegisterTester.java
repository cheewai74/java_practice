package Account;

public class CashRegisterTester {

    public static void main(String[] args) {

        CashRegister register = new CashRegister();
        register.recordPurchase(29.50);
        register.recordPurchase(9.50);
        register.enterPayments(50);

        double change = register.giveChange();
        System.out.println(change);
        System.out.println("Expected: 11.00");
    }
}
