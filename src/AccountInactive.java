import java.sql.SQLOutput;

public class AccountInactive implements AppState{

    @Override
    public void withdraw(float AccountBalance, BankAccount bankAccount) {
        System.out.println("Account is Deactivated");
    }
}
