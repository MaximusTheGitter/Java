package H8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht_2 extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    String schermtekst;

    int man;
    int vrouw;
    int pman;
    int pvrouw;
    int totaal;

    public void init() {
        schermtekst = "waarvan mannen:";
        knop1 = new Button("mannen");
        Knop1Listener k1 = new Knop1Listener();
        knop1.addActionListener( k1 );
        add(knop1);

        schermtekst = "waarvan vrouwen:";
        knop2 = new Button("vrouw");
        Knop2Listener k2 = new Knop2Listener();
        knop2.addActionListener( k2 );
        add(knop2);

        schermtekst = "waarvan mannen:";
        knop3 = new Button("mannen");
        Knop3Listener k3 = new Knop3Listener();
        knop3.addActionListener( k3 );
        add(knop3);

        schermtekst = "waarvan mannen:";
        knop4 = new Button("mannen");
        Knop4Listener k4 = new Knop4Listener();
        knop4.addActionListener( k4 );
        add(knop4);
    }

    public void paint(Graphics g) {
        g.drawString("mannen: " + man, 50, 60 );
        g.drawString("vrouwen: " + vrouw, 50, 75 );
        g.drawString("pontentieel mannen: " + pman, 50, 90 );
        g.drawString("potentieel vrouwen: " + pvrouw, 50, 105 );
        g.drawString("Totaal personen: " + totaal, 50, 120 );
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            man = man + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            vrouw = vrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            pman = pman + 1;
            totaal = totaal + 1;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            pvrouw = pvrouw + 1;
            totaal = totaal + 1;
            repaint();
        }
    }
}
