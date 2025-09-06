package calculator6;

// 工厂接口
public interface IFactory {
    Operation createOperation(String operateType);
}
