package factory;

public class CashRebateReturnFactory implements IFactory {

    // 折扣率
    private double moneyRebate = 1d;
    // 返利条件
    private double moneyCondition = 0d;
    // 返利值
    private double moneyReturn = 0d;

    public CashRebateReturnFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 先打折后返利
     *
     * @return ISale
     */
    @Override
    public ISale createSalesModel() {
        CashNormal cn = new CashNormal();
        CashReturn cr1 = new CashReturn(this.moneyCondition, this.moneyReturn);
        CashRebate cr2 = new CashRebate(this.moneyRebate);

        // 用满m返n算法包装基本的原价算法
        cr1.decorate(cn);

        // 打x折算法装饰满m返n算法
        cr2.decorate(cr1);

        // 将包装好的算法组合返回
        return cr2;
    }
}
