package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht_8 extends Applet {
    int circle;

    public void init() {
        setSize(800, 800);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 100; i++) {
            circle = 1;
            g.drawOval(400 - i * 3, 400 - i * 3, i*6, i*6);
        }
    }
}
