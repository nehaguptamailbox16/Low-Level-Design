package AdapterDesignPattern.Version0Tight;


public class FastTagRecharge {

    // Here YesBankAPI is tightly coupled. if in future any other bank will come then
    // changes has to be done at many places.


    int recharge(YesBankAPI yb , int amount){
        if(yb.getBalance() >= amount){
            System.out.println("Recharged successfully");
            return 1;
        }
        System.out.println("Insufficient funds");
        return -1;
    }
}