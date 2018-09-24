package H4;

import java.awt.*;

public class opdracht_3 {

    public static void draw(Graphics g){
        g.setColor(Color.black);
        g.fillRect(400,50,10,300);
        g.drawRect(400,50,10,300);

        g.setColor(Color.red);
        g.fillRect(410,50,50,25);
        g.drawRect(410,50,50,25);
        g.setColor(Color.red);
        g.fillRect(460,60,60,25);
        g.drawRect(460,60,60,25);

        g.setColor(Color.white);
        g.fillRect(410,75,50,25);
        g.drawRect(410,75,50,25);
        g.setColor(Color.white);
        g.fillRect(460,85,60,25);
        g.drawRect(460,85,60,25);

        g.setColor(Color.blue);
        g.fillRect(410,100,50,25);
        g.drawRect(410,100,50,25);
        g.setColor(Color.blue);
        g.fillRect(460,110,60,25);
        g.drawRect(460,110,60,25);
    }
}
