package visitor;

public class IncomeBill extends AbstractBill  {

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor instanceof AbstractVisitor) {
            ((AbstractVisitor) visitor).visitIncomeBill(this);
            return;
        }
        visitor.visitAbstractBill(this);
    }

    @Override
    public String toString() {
        return "IncomeBill{" + "amount=" + amount + ", item='" + item + '\'' + '}';
    }
}
