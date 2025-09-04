package calculator5;


public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation oper;
        IFactory factory = null;
        switch (operate) {
            case "+":
                factory = new AddFactory();
                break;
            case "-":
                factory = new SubFactory();
                break;
            case "*":
                factory = new MulFactory();
                break;
            case "/":
                factory = new DivFactory();
                break;
        }
        oper = factory.createOperation();
        return oper;
    }

}
