package calculator5;

public class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new Mul();
    }
}
