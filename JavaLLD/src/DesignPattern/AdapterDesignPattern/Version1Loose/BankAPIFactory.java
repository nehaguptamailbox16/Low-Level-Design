package DesignPattern.AdapterDesignPattern.Version1Loose;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankAPIName) {

        //Used factory design pattern also in this.

        if(bankAPIName.equals("YesBank")) {
            return new YesBankAPIAdapter();
        } else if (bankAPIName.equals("ICICIBank")) {
            return new ICICIBankAPIAdapter();
        } else {
            throw new IllegalArgumentException("Your Bank is not available at the moment");
        }
    }
}