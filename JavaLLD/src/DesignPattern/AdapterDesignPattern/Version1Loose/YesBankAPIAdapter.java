package DesignPattern.AdapterDesignPattern.Version1Loose;

public class YesBankAPIAdapter implements BankAPI{

    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
       return yesBankAPI.getBalance();
    }

    @Override
    public void transferMoney(int amount) {
        yesBankAPI.moneyTransfer();
    }
}
