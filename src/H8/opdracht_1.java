package H8;

import sun.font.TextLabel;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht_1 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop1;
    String tekst;


    public void init() {
        tekstvak = new TextField("type here", 30);
        knop = new Button("submit");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
        tekst = "";

        knop1 = new Button("reset");
        knop1.addActionListener( new Knop1Listener() );
        add(knop1);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 150, 45 );

    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekst = tekstvak.getText();
            tekstvak.setText("(╯°□°）╯︵ ┻━┻");
            repaint();
        }
    }
    class Knop1Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekst = "";
            tekstvak.setText("");
            repaint();
        }
    }
}

