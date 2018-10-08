package H11;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int x = 0;

        while(teller > 9) {
            x += 20;
            g.drawString("" + teller, x,  10 );
            teller--;
        }
    }
}
