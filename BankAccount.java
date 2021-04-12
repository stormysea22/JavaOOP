import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalNumberInAccounts;

    public BankAccount() {
        generateNewAccountNumber();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private String generateNewAccountNumber() {
        String numbers = "0123456789";
        String newAccountNumber = "";

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int num = numbers.charAt(rand.nextInt(10));
            newAccountNumber += num;
        }
        accountNumber = newAccountNumber;
        return newAccountNumber;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getCheckingBalance() {
        System.out.println("Checking Balance: $" + this.checkingBalance);
        return this.checkingBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() {
        System.out.println("Savings Balance: $" + this.savingsBalance);
        return this.savingsBalance;
    }

    public void depositChecking(double checkingBalance) {
        this.setCheckingBalance(checkingBalance);
        totalNumberInAccounts += checkingBalance;
    }

    public void depositSavings(double savingsBalance) {
        this.setSavingsBalance(savingsBalance);
        totalNumberInAccounts += savingsBalance;
    }

    public void withdrawalChecking(int number) {

        if (getCheckingBalance() < Double.valueOf(number)) {
            System.out.println("Sorry, you dont have enough moolahs.");
        } else {
            setCheckingBalance(getCheckingBalance() - Double.valueOf(number));

        }
    }

    public void withdrawalSavings(int number) {
        if (getSavingsBalance() < Double.valueOf(number)) {
            System.out.println("Sorry, you dont have enough moolahs.");
        } else {
            setSavingsBalance(getSavingsBalance() - Double.valueOf(number));

        }
    }

    public double total() {
        totalNumberInAccounts = savingsBalance + checkingBalance;
        return totalNumberInAccounts;
    }

}