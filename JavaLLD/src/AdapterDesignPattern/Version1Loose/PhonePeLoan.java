package AdapterDesignPattern.Version1Loose;


public class PhonePeLoan {

    public boolean LoanCheck(BankAPI yb){
        return yb.checkBalance() > 100;
    }
}
