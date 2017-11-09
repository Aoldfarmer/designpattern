package visitor;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {

    private List<Bill> bills = new ArrayList<>();

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public void show(Visitor visitor) {
        bills.forEach(bill -> bill.accept(visitor));
    }
}
