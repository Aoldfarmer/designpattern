package visitor;

public abstract class AbstractVisitor implements Visitor {

    abstract void visitIncomeBill(IncomeBill incomeBill);

    abstract void visitConsumeBill(ConsumeBill consumeBill);

    @Override
    public void visitAbstractBill(AbstractBill abstractBill) {

    }
}
