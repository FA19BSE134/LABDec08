import java.util.ArrayList;

public class BankCostumers {
    ArrayList<AccountHolder> Collection = new ArrayList<AccountHolder>();

    public void Add(AccountHolder accountHolder){
        Collection.add(accountHolder);
        accountHolder.Notify("Account has been created");
    }

    public void Remove(String CNIC, AccountHolder accountHolder){
        if(accountHolder.CNIC == CNIC){
            Collection.remove(accountHolder);
            accountHolder.Notify("Account has been removed");
        }
    }

}
