package Basic.Arrays.Example2;

import Basic.Arrays.Example1.BankAccount;

public class BankTester {

    public static void main(String[] args) {

        Bank firstBankOfJava = new Bank();
        firstBankOfJava.addAccount(new BankAccount(1000, 20000));
        firstBankOfJava.addAccount(new BankAccount(1015, 10000));
        firstBankOfJava.addAccount(new BankAccount(1729, 15000));

        double threshold = 15000;
        int c = firstBankOfJava.count(threshold);
        System.out.println("Count: " + c);
        System.out.println("Expected: 2");

        int accountNumber = 1015;
        BankAccount a = firstBankOfJava.find(accountNumber);
        if( a == null)
            System.out.println("No matching  account");
        else
            System.out.println("Balance of matching account: " + a.getBalance());

        System.out.println("Expected: 10000");

        BankAccount max = firstBankOfJava.getMaximum();
        System.out.println("Account with largest balance: " +max.getAccountNumber());
        System.out.println("Expected: 1001");

    }
}
