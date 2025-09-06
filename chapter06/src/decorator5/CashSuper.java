package decorator5;

// 抽象装饰类
public abstract class CashSuper implements ISale {

    protected ISale component;

    public void decorate(ISale component) {
        this.component = component;
    }

    public double acceptCash(double price, int num) {
        double result = price;
        if (this.component != null) {
            // 若装饰对象不为空，则调用装饰对象的acceptCash方法
            result = this.component.acceptCash(price, num);
        }
        return result;
    }

}
