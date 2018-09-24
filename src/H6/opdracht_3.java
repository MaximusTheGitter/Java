package H6;

import java.awt.*;
import java.applet.*;

public class opdracht_3 extends Applet{

    int a = 2147483647;
    int b = 1;
    int c = a+b;

    public void init(){

        c = a+b;
    }

    public void paint(Graphics g){

        g.drawString("(2147483647+1) in java maakt:" + c, 20, 20);
    }
}
