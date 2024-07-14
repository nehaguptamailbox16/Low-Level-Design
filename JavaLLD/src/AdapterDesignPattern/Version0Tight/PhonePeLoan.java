package AdapterDesignPattern.Version0Tight;

public class PhonePeLoan {

    public boolean LoanCheck(YesBankAPI yb){
        return yb.getBalance() > 100;
    }
}
