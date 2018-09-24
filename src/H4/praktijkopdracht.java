package H4;

import java.awt.*;
import java.applet.*;

public class praktijkopdracht extends Applet {

    public void init(){
        setSize(720,323);
        setBackground(Color.white);
    }

    public void paint(Graphics g){

        //Lijn
        g.drawLine(10,20,231,20);
        g.drawString("Lijn",101,35);

        //Rechthoek
        g.drawRect(10,40,221,101);
        g.drawString("Rechthoek",91,155);

        //Afgeronde rechthoek
        g.drawRoundRect(10,160,221,101,30,30);
        g.drawString("Afgeronde rechthoek",60,275);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(240,40,221,101);
        g.setColor(Color.black);
        g.drawOval(240,40,221,101);
        g.drawString("Gevulde rechthoek met ovaal",271,155);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(240,160,221,101);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",301,275);

        //Taartpunt met ovaal er omheen
        g.setColor(Color.magenta);
        g.fillArc(470,30,221,101,0,45);
        g.setColor(Color.black);
        g.drawOval(470,30,221,101);
        g.drawString("Taartpunt met ovaal er omheen",500,155);

        //Cirkel
        g.drawOval(530,160,101,101);
        g.drawString("Cirkel",566,275);


    }
}
