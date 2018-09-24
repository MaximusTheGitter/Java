package H6;

import java.awt.*;
import java.applet.*;
import java.text.DecimalFormat;

public class praktijkopdracht extends Applet {

    double a;
    double b;
    double c;
    double d;

   double uitkomst;

    DecimalFormat df = new
            DecimalFormat("#.#");

    public void init(){

        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;

        uitkomst = (a+b+c)/d;

    }

    public void paint(Graphics g){

        g.drawString("cijfer a:" + a, 20,20);
        g.drawString("cijfer a:" + b, 20,35);
        g.drawString("cijfer a:" + c, 20,50);
        g.drawString("gemiddelde:" + df.format(uitkomst), 20,65);
    }
}
