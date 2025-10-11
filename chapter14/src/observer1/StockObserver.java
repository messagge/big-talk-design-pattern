package observer1;

import observer3.Observer;
import observer3.Subject;

public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update() {
        System.out.println(this.sub.name + "：" + this.sub.getAction() + "！" + this.name + "，请关闭股票行情，赶紧工作。");
    }

}
