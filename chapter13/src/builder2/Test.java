package builder2;

import javax.swing.*;
import java.awt.*;

class Test extends JFrame {

    public Test() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {

        //初始化瘦小人建造者类
        PersonThinBuilder gThin = new PersonThinBuilder(g);
        gThin.build();//画瘦小人

        //初始化胖小人建造者类
        PersonFatBuilder gFat = new PersonFatBuilder(g);
        gFat.build();//画胖小人
    }

    public static void main(String[] args) {
        new Test().setVisible(true);
    }
}











