package Basic.Account;

import java.util.Scanner;

public class CashRegisterSimulator{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        CashRegister register = new CashRegister();

        System.out.println("Enter price");
        double price = in.nextDouble();
        register.recordPurchase(price);

        System.out.println("Enter dollars: ");
        int dollars = in.nextInt();
        System.out.println("Enter quaters: ");
        int quaters = in.nextInt();
        System.out.println("Enter dimes: ");
        int dimes = in.nextInt();
        System.out.println("Enter nickels: ");
        int nickels = in.nextInt();
        System.out.println("Enter pennies: ");
        int pennies = in.nextInt();
        register.enterPayments(dollars, quaters, dimes, nickels, pennies);
        System.out.println("Your change: ");
        System.out.println(register.giveChange());
    }

}
