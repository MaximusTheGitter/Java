package H11;

import java.applet.Applet;
import java.awt.*;

public class opdracht_4 extends Applet {

    public void init() {
        setSize(300, 400);
        setLayout(null);
    }

    public void paint(Graphics g) {

        int intY = 40;
        g.drawString("Tafel van " + 3 + ":", 10, 25);
        for (int i = 1; i <= 10; i++) {
            intY += 20;
            g.drawString("" + i + " x " + 3 + " = " + (i * 3), 10, intY);
            }
    }
}


