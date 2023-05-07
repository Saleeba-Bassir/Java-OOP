import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int totalAccounts = 0;
    private static double totalMoney = 0.0;
    private String accountNumber;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        totalAccounts++;
        totalMoney += (checkingBalance + savingsBalance);
        this.accountNumber = generateAccountNumber();
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (amount <= checkingBalance) {
                checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking account");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (amount <= savingsBalance) {
                savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in savings account");
            }
        }
    }

    public double getTotalBalance() {
        return checkingBalance + savingsBalance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        String number = "";
        for (int i = 0; i < 10; i++) {
            number += rand.nextInt(10);
        }
        return number;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
