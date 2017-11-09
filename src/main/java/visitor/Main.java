package visitor;

public class Main {

    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        accountBook.addBill(new IncomeBill(0.91, "烟"));
        accountBook.addBill(new IncomeBill(2.91, "烟2"));
        accountBook.addBill(new IncomeBill(4.91, "烟3"));
        accountBook.addBill(new ConsumeBill(0.31, "水"));
        accountBook.addBill(new ConsumeBill(3.31, "水1"));
        accountBook.addBill(new ConsumeBill(4.87, "水2"));

        BOSS boss = new BOSS();
        accountBook.show(boss);
        boss.printConsumeTotal();
        boss.printIncomeTotal();

        CPA cpa = new CPA();
        accountBook.show(cpa);
        cpa.printIncomeBillCount();
        cpa.printConsumeBillCount();

        CFO cfo = new CFO();
        accountBook.show(cfo);
    }
}
