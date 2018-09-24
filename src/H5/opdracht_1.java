package H5;

import java.awt.*;
import java.applet.*;

public class opdracht_1 extends Applet {

    Color black = new Color(0,0,0);
    Color magenta = new Color(255,0,255);
    int x = 221;
    int y = 101;

    public void init(){
        setSize(720,323);
        setBackground(Color.white);
    }

    public void paint(Graphics g){

        //Lijn
        g.drawLine(10,20,231,20);
        g.drawString("Lijn",y,35);

        //Rechthoek
        g.drawRect(10,40,x,y);
        g.drawString("Rechthoek",91,155);

        //Afgeronde rechthoek
        g.drawRoundRect(10,160,x,y,30,30);
        g.drawString("Afgeronde rechthoek",60,275);

        //Gevulde rechthoek met ovaal
        g.setColor(magenta);
            g.fillRect(240,40,x,y);
        g.setColor(black);
        g.drawOval(240,40,x,y);
        g.drawString("Gevulde rechthoek met ovaal",271,155);

        //Gevulde ovaal
        g.setColor(magenta);
        g.fillOval(240,160,x,y);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",301,275);

        //Taartpunt met ovaal er omheen
        g.setColor(magenta);
        g.fillArc(470,30,x,y,0,45);
        g.setColor(black);
        g.drawOval(470,30,x,y);
        g.drawString("Taartpunt met ovaal er omheen",500,155);

        //Cirkel
        g.drawOval(530,160,y,y);
        g.drawString("Cirkel",566,275);


    }
}
