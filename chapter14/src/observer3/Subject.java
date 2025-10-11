package observer3;

import java.util.ArrayList;

// 通知者接口
public abstract class Subject {
    protected String name;

    // 同事列表. 针对抽象的Observer编程
    private ArrayList<Observer> list = new ArrayList<Observer>();
    private String action;

    public Subject(String name) {
        this.name = name;
    }

    // 增加同事（有几个同事需要秘书通知，就增加几个对象）
    public void attach(Observer observer) {
        list.add(observer);
    }

    // 减少同事
    public void detach(Observer observer) {
        list.remove(observer);
    }

    // 通知
    public void notifyEmployee() {
        // 给所有登记过的同事发通知
        for (Observer item : list) {
            item.update();
        }
    }

    // 得到状态
    public String getAction() {
        return this.action;
    }

    // 设置状态（就是设置具体通知的话）
    public void setAction(String value) {
        this.action = value;
    }
}
