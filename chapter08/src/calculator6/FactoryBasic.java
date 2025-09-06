package calculator6;

public class FactoryBasic implements IFactory {
    @Override
    public Operation createOperation(String operateType) {
        Operation oper = null;
        switch (operateType) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
        }
        return oper;
    }
}
