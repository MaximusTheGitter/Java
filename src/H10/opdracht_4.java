package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class opdracht_4 extends Applet {

    public TextField maandinvoer;
    Label label;
    String s, line;
    int maand;

    public void init(){

        maandinvoer = new TextField("", 10);
        add(maandinvoer);

        label = new Label("voer nummer 1-12 in en druk enter");
        maandinvoer.addActionListener(new maandinvoerListener() );
        line = "";
        add(label);
        add(maandinvoer);
    }

    public void paint(Graphics g){
        g.drawString(line,50,50);
    }

    class maandinvoerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = maandinvoer.getText();
            maand = Integer.parseInt( s );
            switch (maand) {
                case 1:
                    line = "januari heeft 31 dagen";
                    break;
                case 2:
                    line = "februari heeft 28 dagen";
                    break;
                case 3:
                    line = "maart heeft 31 dagen";
                    break;
                case 4:
                    line = "april heeft 30 dagen";
                    break;
                case 5:
                    line = "mei heeft 31 dagen";
                    break;
                case 6:
                    line = "juni heeft 30 dagen";
                    break;
                case 7:
                    line = "juli heeft 31 dagen";
                    break;
                case 8:
                    line = "augustus heeft 31 dagen";
                    break;
                case 9:
                    line = "september heeft 30 dagen";
                    break;
                case 10:
                    line = "oktober heeft 31 dagen";
                    break;
                case 11:
                    line = "november heeft 30 dagen";
                    break;
                case 12:
                    line = "december heeft 31 dagen";
                    break;
                default:
                    line = "typ een nummer van 1 tot 12..!";
                    break;
            }
            repaint();
        }
    }
}
