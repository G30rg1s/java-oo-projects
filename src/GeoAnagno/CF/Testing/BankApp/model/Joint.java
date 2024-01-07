package GeoAnagno.CF.Testing.BankApp.model;
import GeoAnagno.CF.Testing.BankApp.Account;

public class Joint {
    private Account account;
    private String owner2;

    public Joint(Account account, String owner2) {
        this.account = account;
        this.owner2 = owner2;
    }

    public Account getAccount() {
        return account;
    }

    public String getOwner2() {
        return owner2;
    }

    public double getBalance() {
        return account.getBalance();
    }

    public void jointMessage(){
        System.out.println("the account " + getAccount() + " now has a second owner "+ getOwner2());
    }

    public void jointToString(){
        System.out.println(" ( " + getAccount() + " ) ");
    }
}
