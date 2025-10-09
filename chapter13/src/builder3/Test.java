package builder3;

import javax.swing.*;
import java.awt.*;

class Test extends JFrame {

    public Test() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {

        PersonBuilder gThin = new PersonThinBuilder(g);
        PersonDirector pdThin = new PersonDirector(gThin);
        pdThin.CreatePerson();

        PersonBuilder gFat = new PersonFatBuilder(g);
        PersonDirector pdFat = new PersonDirector(gFat);
        pdFat.CreatePerson();
        
    }

    public static void main(String[] args) {
        new Test().setVisible(true);
    }
}






