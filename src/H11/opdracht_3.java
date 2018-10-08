package H11;

import java.awt.*;
import java.applet.*;

public class opdracht_3 extends Applet {

    Label labelHeader;

    public void init() {
        setLayout(null);
        labelHeader = new Label("Fibonacci:");
        labelHeader.setBounds(150, 10, 75, 25);
        add(labelHeader);
    }
    public void paint(Graphics g) {
        int intOne = 1, intTwo = 0, intTemp = 0, x = 10;
        for (int i = 0; i < 13; i++) {
            g.drawString(intOne + intTwo + " ", x, 50);
            x += 25;
            intTemp = intOne;
            intOne = intTwo;
            intTwo = intTemp + intTwo;
        }
    }
}