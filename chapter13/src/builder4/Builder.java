package builder4;

// 抽象建造者
public abstract class Builder {
    public abstract void buildPartA();      //建造部件A
    public abstract void buildPartB();      //建造部件B
    public abstract Product getResult();    //得到产品
}
