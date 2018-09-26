package H11;

import java.awt.*;
import java.applet.Applet;

public class opdracht_2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int eind = 5;

        for(int i = 10; i < eind; i++) {
            g.drawString("", 20,20);
        }
    }
}

