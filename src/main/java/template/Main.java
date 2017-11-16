package template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger LOG = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        LOG.debug("货币市场利息额度为：" + account.calculateInterest());
        account = new CDAccount();
        LOG.debug("定额市场利息额度为：" + account.calculateInterest());


    }
}
