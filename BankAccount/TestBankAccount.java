public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.0, 500.0);
        BankAccount account2 = new BankAccount(2000.0, 1000.0);

        System.out.println("Account 1:");
        System.out.println("Checking balance: " + account1.getCheckingBalance());
        System.out.println("Savings balance: " + account1.getSavingsBalance());
        account1.deposit(200.0, "checking");
        System.out.println("Checking balance after deposit: " + account1.getCheckingBalance());
        account1.withdraw(300.0, "savings");
        System.out.println("Savings balance after withdrawal: " + account1.getSavingsBalance());
        System.out.println("Total balance: " + account1.getTotalBalance());
        System.out.println("Account number: " + account1.getAccountNumber());

        System.out.println();

        System.out.println("Account 2:");
        System.out.println("Checking balance: " + account2.getCheckingBalance());
        System.out.println("Savings balance: " + account2.getSavingsBalance());
        account2.withdraw(500.0, "checking");
        System.out.println("Checking balance after withdrawal: " + account2.getCheckingBalance());
        account2.deposit(1000.0, "savings");
        System.out.println("Savings");
    }
}