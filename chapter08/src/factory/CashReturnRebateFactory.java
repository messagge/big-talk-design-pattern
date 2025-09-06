package factory;

public class CashReturnRebateFactory implements IFactory {

    private double moneyRebate = 1d;
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturnRebateFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 先返利后打折
     *
     * @return ISale
     */
    @Override
    public ISale createSalesModel() {
        CashNormal cn2 = new CashNormal();
        CashRebate cr3 = new CashRebate(this.moneyRebate);
        CashReturn cr4 = new CashReturn(this.moneyCondition, this.moneyReturn);

        //用打x折算法包装基本的原价算法
        cr3.decorate(cn2);
        //满m返n算法装饰打x折算法
        cr4.decorate(cr3);
        //将包装好的算法组合返回
        return cr4;
    }
}
