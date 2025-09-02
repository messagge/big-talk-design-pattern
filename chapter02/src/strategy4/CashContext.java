package strategy4;

public class CashContext {

    //声明一个CashSuper对象
    private CashSuper cs;

    // 通过构造方法，传入具体的收费策略
    public CashContext(CashSuper csuper) {
        this.cs = csuper;
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同，获得计算结果
        return this.cs.acceptCash(price, num);
    }
}
