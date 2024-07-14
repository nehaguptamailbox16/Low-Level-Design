package AdapterDesignPattern.Version1Loose;

public class ICICIBankAPIAdapter implements BankAPI{

    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public int checkBalance() {
        return iciciBankAPI.checkBalance();
    }

    @Override
    public void transferMoney(int amount) {
        iciciBankAPI.transferMoney(100);
    }
}
