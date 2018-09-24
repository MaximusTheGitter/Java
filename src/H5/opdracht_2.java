package H5;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {

    public void init(){
        setBackground(Color.decode("#FFFFFF"));
        setSize(1400, 800);
    }
    public void paint(Graphics g){

        float Weight1 = 20;
        float Weight2 = 100;
        float Weight3 = 50;


        g.setColor(Color.BLACK);
        g.drawLine( 500, 100, 500, 600);
        g.drawLine(500, 600, 850, 600);

        g.drawString("Personen", 855, 607);
        g.drawString("Gewicht (KG)", 425, 80);

        g.drawString("100kg", 462, 100);
        g.drawString("  80kg", 462, 200);
        g.drawString("  60kg", 462, 300);
        g.drawString("  40kg", 462, 400);
        g.drawString("  20kg", 462, 500);
        g.drawString("    0kg", 462, 600);

        g.drawString("Valerie", 550, 615);
        g.drawString("Jeroen", 655, 615);
        g.drawString("Hans", 760, 615);

        g.setColor(Color.RED);
        g.fillRect(550, 600-(int)(100*Weight1/20), 50, (int)(100*Weight1/20));

        g.setColor(Color.BLUE);
        g.fillRect(650, 600-(int)(100*Weight2/20), 50, (int)(100*Weight2/20));

        g.setColor(Color.ORANGE);
        g.fillRect(750, 600-(int)(100*Weight3/20), 50, (int)(100*Weight3/20));

        g.setColor(Color.decode("#BBBBBB"));
        for(int i = 0; i < 5; i++)
            g.drawLine(500, 100 + 100 * i, 850, 100 + 100 * i);
    }
}