package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht_7 extends Applet {
    int circle;

    public void init() {
        setSize(800, 800);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 51; i++) {
            circle = 1;
            g.drawOval(400 - i * 5, 400 - i * 5, i*10, i*10);
        }
    }
}
