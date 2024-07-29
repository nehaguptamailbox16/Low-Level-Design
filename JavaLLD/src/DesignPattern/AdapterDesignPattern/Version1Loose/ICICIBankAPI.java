package DesignPattern.AdapterDesignPattern.Version1Loose;

public class ICICIBankAPI {
    public int checkBalance(){
        return 1000;
    }

    public void transferMoney(int amount){
        System.out.println("Money is transferred via ICICI Bank!");
    }
}
