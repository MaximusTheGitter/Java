package H12;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet{
    Button[] button = new Button[100];

    public void init(){
        for (int teller = 1; teller <= 25; teller++){
            button[teller] = new Button("button " + teller);
            add(button[teller]);
        }

    }
    public void paint(Graphics g){

    }
}
