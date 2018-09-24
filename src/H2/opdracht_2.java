package H2;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {

    public void init() {
        setBackground(Color.white);

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.setFont(new Font("Impact", Font.PLAIN, 24));
        g.drawString("Niels", 168, 155);
        g.setColor(Color.red);
        g.drawString("Reiziger",152,180);

    }

}