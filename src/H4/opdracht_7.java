package H4;

import java.applet.Applet;
import java.awt.*;

public class opdracht_7 extends Applet {

    public void init(){
        setBackground(Color.blue);
    }

    public void paint(Graphics g){

        g.setColor(Color.red);
        g.fillRoundRect(150,100,100,100,10,10);

        g.setColor(Color.black);
        g.fillArc(170,120,20,20,0,360);
        g.fillArc(210,120,20,20,0,360);
        g.fillArc(170,160,20,20,0,360);
        g.fillArc(210,160,20,20,0,360);



    }
}
