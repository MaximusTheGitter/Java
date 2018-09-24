package H4;

import java.awt.*;

public class opdracht_6 {

    public static void doodle(Graphics g){

        g.setColor(Color.black);
        g.fillRoundRect(620,200,74,130,20,20);
        g.drawRoundRect(620,200,74,130,20,20);

        g.setColor(Color.red);
        g.fillArc(642,210,30,30,0,360);
        g.drawArc(642,210,30,30,0,360);

        g.setColor(Color.orange);
        g.fillArc(642,250,30,30,0,360);
        g.drawArc(642,250,30,30,0,360);

        g.setColor(Color.green);
        g.fillArc(642,290,30,30,0,360);
        g.drawArc(642,290,30,30,0,360);

    }
}
