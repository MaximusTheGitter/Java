package H6;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {

    int m;
    int a = m;
    int b = 24;
    int c = 365;

    int min = 60;
    int sec = 1;


    public void init(){

       m = min/sec;

        a = min*60;
        b = a*b;
        c = b*c;

    }

    public void paint(Graphics g){

        g.drawString("een uur in seconden is: " + a, 20, 20);
        g.drawString("een dag in seconden is: " + b, 20, 35);
        g.drawString("een jaar in seconden is: " + c, 20, 50);
    }
}
