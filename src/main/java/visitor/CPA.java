package visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CPA extends AbstractVisitor {

    private static final Logger LOG = LoggerFactory.getLogger(CPA.class);

    private int incomeBillCount;
    private int consumeBillCount;

    @Override
    void visitIncomeBill(IncomeBill incomeBill) {
        incomeBillCount++;
    }

    @Override
    void visitConsumeBill(ConsumeBill consumeBill) {
        consumeBillCount++;
    }

    public void printIncomeBillCount() {
        LOG.debug("CPA 查看到总共有{}笔收入订单", incomeBillCount);
    }

    public void printConsumeBillCount() {
        LOG.debug("CPA 查看到总共有{}笔支出订单", consumeBillCount);
    }
}
