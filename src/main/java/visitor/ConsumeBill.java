package visitor;

public class ConsumeBill extends AbstractBill {

    public ConsumeBill(double amount, String item) {
        super(amount, item);
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor instanceof AbstractVisitor) {
            ((AbstractVisitor) visitor).visitConsumeBill(this);
            return;
        }
        visitor.visitAbstractBill(this);
    }

    @Override
    public String toString() {
        return "ConsumeBill{" + "amount=" + amount + ", item='" + item + '\'' + '}';
    }
}
