package H6;

import java.awt.*;
import java.applet.*;


public class opdracht_1 extends Applet {
    int a;
    int b;
    int uitkomst;



    public void init() {
        a = 113;
        b = 4;

        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt: " + uitkomst, 20, 20);
        g.drawString("Jeannette krijgt: " + uitkomst, 20, 35);
        g.drawString("Ali krijgt: " + uitkomst, 20, 50);
        g.drawString("Niels krijgt: " + uitkomst, 20, 65);
        g.drawString("113 word verdeelt door 4 personen dat is 113/4: " + uitkomst, 20, 80);
    }
}