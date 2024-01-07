package GeoAnagno.CF.Testing.BankApp.model;
import GeoAnagno.CF.Testing.BankApp.Account;

public class OverDraft {
   private Account account;

    public OverDraft(Account account) {
        this.account = account;
    }


    public void overDraft(double amount, String ssn) throws Exception  {
        try {

            if (!account.isSsnValid(account.getSsn())) {
                throw new Exception("Wrong ssn");
            }

            account.setBalance(account.getBalance() - amount);
            overdraftMessage();
        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public void overdraftMessage(){
        System.out.println("The amount "+ (account.getBalance() * -1)+" will be deducted from your next deposit");
    }


    public double getBalance() {
            return account.getBalance();
        }
}


