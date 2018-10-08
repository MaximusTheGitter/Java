package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht_5 extends Applet {

    public void init() {
        setSize(150, 150);
    }

    public void paint(Graphics g) {
        int square = 20, x = 20, y = 20, w = square, h = square;
        for (int i = 1; i < 6; i++) {
            g.drawRect(x, y, w, h);
            y += square;
            x += square;
        }
    }
}