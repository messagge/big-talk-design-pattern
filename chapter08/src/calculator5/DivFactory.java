package calculator5;

public class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new Div();
    }
}
