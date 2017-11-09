package visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CFO implements Visitor {
    private static final Logger LOG = LoggerFactory.getLogger(CFO.class);

    private int billCount;

    @Override
    public void visitAbstractBill(AbstractBill abstractBill) {
        LOG.debug("CFO 访问到第{}笔订单，订单详情为：{}", ++billCount, abstractBill);
    }
}
