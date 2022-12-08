public class AccountActive implements AppState {
    @Override
    public void withdraw(float AccountBalance, BankAccount bankAccount) {
        System.out.println("Account state is Active");
        bankAccount.AccountBalance -= AccountBalance;
        System.out.println("Your new balance is " + bankAccount.AccountBalance);
    }
}
