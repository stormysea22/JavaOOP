public class BankAccountTest {

    public static void main(String[] args) {
		BankAccount accountOne = new BankAccount();
		
		System.out.println("Bank Account Number: " + accountOne.getAccountNumber());
		accountOne.depositChecking(1000);
		accountOne.depositSavings(1000);
		accountOne.getCheckingBalance();
		accountOne.getSavingsBalance();
		accountOne.withdrawalChecking(100);
		accountOne.withdrawalSavings(100);
		System.out.println(accountOne.getCheckingBalance());
		System.out.println(accountOne.getSavingsBalance());
		System.out.println("Total of all Accounts: $" + accountOne.total());

	}

}
