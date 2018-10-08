package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht_6 extends Applet {
    int x = 100;
    int y = 100;
    int w = 5;
    int h = 5;
    int intCoordinates = -10;
    int intSize = 20;

    public void init() {
        setSize(220, 220);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 6; i++) {
            g.drawOval(x, y, w, h);
            x += intCoordinates;
            y += intCoordinates;
            w += intSize;
            h += intSize;
        }
    }
}
