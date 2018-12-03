package H12;

import java.awt.*;
import java.applet.*;

public class opdracht_1 extends Applet {
    double numbers[];
    double average;

    public void init() {
        numbers = new double[10];
        double total = 0;

        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = 267 * counter + 322;
        }

        for (double number : numbers) {
            total = total + number;
        }
        average = total / numbers.length;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < numbers.length; teller ++) {
            g.drawString("" + numbers[teller], 65, 20 * teller + 20);
        }
        int xString = 10;
        g.drawString("average :  " + average, xString, 220);
    }
}