package GeoAnagno.CF.Testing.BankApp;
import GeoAnagno.CF.Testing.BankApp.model.OverDraft;
import GeoAnagno.CF.Testing.BankApp.model.Joint;

public class Main {
    public static void main(String[] args) {

        Account AliWon = new Account(1, "Gr1234", "Alice", "Wonderland", "1234", 100);
        Account BoMa = new Account(2, "GR5678", "Bob", "Marley", "5678", 200);
        OverDraft AliWonOD = new OverDraft(AliWon);
        Joint BoMapJ=new Joint(BoMa,"Takis");



        System.out.println("AliWon: "+AliWon.accountToString());
        System.out.println("BoMa: "+BoMa.accountToString());
        try{
             AliWon.deposit(230);
             AliWon.withdraw(330,"1234");
             AliWon.deposit(2000);
            AliWonOD.overDraft(2100,"1234");
           } catch (Exception e) {
             e.printStackTrace();
             }

        System.out.println("AliWon: "+AliWon.accountToString());
        BoMapJ.jointMessage();

    }
}
