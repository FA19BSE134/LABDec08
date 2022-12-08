import com.sun.corba.se.impl.ior.ObjectAdapterIdNumber;

public class BankAccount implements AppState{
    int AccountID= 1;
    float AccountBalance;
    AppState state;
    @Override
    public void withdraw(float AccountBalance, BankAccount bankAccount){
        if(this.AccountBalance <=10){
            state = new AccountInactive();
        }else{
            state = new AccountActive();
        }
        state.withdraw(AccountBalance, this);
    }
}
