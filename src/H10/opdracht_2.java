package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht_2 extends Applet {

    public TextField numinput;
    Button check;
    float result = 2146740985;
    float result1 = -2146740985;

    public void init(){
        setSize(300, 100);

        numinput = new TextField("", 20);
        add(numinput);

        check = new Button("Enter");
        checkListener C = new checkListener();
        numinput.addActionListener( C );
        check.addActionListener( C );
        add(check);


    }

    public void paint(Graphics g){
        if (result == 2146740985)
            return;
        else
            g.drawString("high: " + result, 50, 50);
        if (result == -2146740985)
            return;
        else
            g.drawString("low: " + result1,50, 65);
    }


    class checkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            float numinput1 = Float.parseFloat(numinput.getText());
            if (result > numinput1)
                result = numinput1;
            float numinput2 = Float.parseFloat(numinput.getText());
            if (result1 < numinput2)
                result1 = numinput2;
            repaint();
        }
    }

}