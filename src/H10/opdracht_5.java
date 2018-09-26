package H10;

import javax.xml.soap.Text;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener.*;

public class opdracht_5 extends Applet {

    public TextField input;
    Label c;
    String s, line;

    float result;

    public void init() {
        setSize(300,90);

        input = new TextField("", 5);
        c = new Label("voer cijfer in:");
        input.addActionListener(new cijferListener());
        line = "";
        add(c);
        add(input);

    }

    public void paint(Graphics g) {
        g.drawString("Uw cijfer: " + result, 78,50);

    }

    class cijferListener implements ActionListener {

        public void actionPerformed(ActionEvent e ) {
            s = input.getText();
            repaint();
        }
    }
}
