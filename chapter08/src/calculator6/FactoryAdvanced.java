package calculator6;

public class FactoryAdvanced implements IFactory {
    @Override
    public Operation createOperation(String operateType) {
        Operation oper = null;
        switch (operateType) {
            case "pow":
                // 指数运算类实例
                oper = new Pow();
                break;
            case "log":
                // 对数运算类实例
                oper = new Log();
                break;

            //此处可扩展其他高级运算类的实例化，但修改
            //当前工厂类不会影响到基础运算工厂类

        }
        return oper;
    }
}
