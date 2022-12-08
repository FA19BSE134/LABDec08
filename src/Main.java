public class Main {
    public static void main(String[] args) {
        String CNIC= "32303-5184390-5";

        BankAccount bankAccount = new BankAccount();

        bankAccount.AccountBalance = 10;

        bankAccount.withdraw(10, bankAccount);



        AccountHolder Umer = new AccountHolder(CNIC);

        BankCostumers bankCostumers = new BankCostumers();
        bankCostumers.Add(Umer);
        bankCostumers.Remove(Umer.CNIC, Umer);


    }
}