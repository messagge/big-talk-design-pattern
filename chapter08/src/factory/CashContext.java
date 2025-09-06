package factory;


public class CashContext {

    // 声明一个CashSuper对象
    private ISale cs;

    // 通过构造方法，传入具体的收费策略（简单工厂）
    public CashContext(int cashType) {
        IFactory factory = null;
        switch (cashType) {
            case 1:
                factory = new CashRebateReturnFactory(1d, 0d, 0d);
                break;
            case 2:
                factory = new CashRebateReturnFactory(0.8d,0d,0d);
                break;
            case 3:
                factory = new CashRebateReturnFactory(0.7d,0d,0d);
                break;
            case 4:
                factory = new CashRebateReturnFactory(1,300d,100d);
                break;
            case 5:
                // 先打8折,再满300返100
                factory = new CashRebateReturnFactory(0.8d,300d,100d);
                break;
            case 6:
                // 先满200返50，再打7折
                factory = new CashReturnRebateFactory(0.7d,200d,50d);
                break;
        }
        this.cs = factory.createSalesModel();
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同，获得计算结果
        return this.cs.acceptCash(price, num);
    }
}
