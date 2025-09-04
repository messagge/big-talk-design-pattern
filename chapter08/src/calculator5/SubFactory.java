package calculator5;

public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new Sub();
    }
}
