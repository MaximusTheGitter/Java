package H4;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {

    public void init(){
        setSize(800,500);
    }

    public void paint(Graphics g) {
      g.drawPolygon(new int[]{100,200,300}, new int[] {200,150,200}, 3);
      g.drawRect(100,200,200,150);
      g.drawRect(150,280,50,50);
      g.drawRect(155,285,18,18);
      g.drawRect(177,285,18,18);
      g.drawRect(155,307,18,18);
      g.drawRect(177,307,18,18);
      g.drawRect(238,280,40,70);
      g.drawRect(268,320,6,2);

      opdracht_3.draw(g);
      opdracht_6.doodle(g);

    }
}
