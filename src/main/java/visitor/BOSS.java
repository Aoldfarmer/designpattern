package visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BOSS extends AbstractVisitor {

    private static final Logger LOG = LoggerFactory.getLogger(BOSS.class);

    private double incomeTotal;
    private double consumeTotal;

    @Override
    void visitConsumeBill(ConsumeBill consumeBill) {
        consumeTotal += consumeBill.getAmount();
    }

    @Override
    void visitIncomeBill(IncomeBill incomeBill) {
        incomeTotal += incomeBill.getAmount();
    }


    public void printIncomeTotal() {
        LOG.debug("BOSS 查看账单总的收入为：{}", incomeTotal);
    }

    public void printConsumeTotal() {
        LOG.debug("BOSS 查看账单总的支出为：{}", consumeTotal);
    }
}
