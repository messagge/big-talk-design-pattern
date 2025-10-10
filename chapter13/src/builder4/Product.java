package builder4;

import java.util.ArrayList;

// 产品类
public class Product {
    ArrayList<String> parts = new ArrayList<String>();

    // 添加新的产品部件
    public void add(String part){
        parts.add(part);
    }
    // 列举所有产品部件
    public void show(){
        for(String part : parts){
            System.out.println(part);
        }
    }
}
