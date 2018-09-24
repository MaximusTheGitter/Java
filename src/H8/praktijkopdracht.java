package H8;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class praktijkopdracht extends Applet {
    float result;

    TextField field1;
    TextField field2;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public void init(){
        field1 = new TextField("",10);
        field2 = new TextField("",10);
        add(field1);
        add(field2);

        button1 = new Button("/");
        Button1Listener b1 = new Button1Listener();
        button1.addActionListener(new Button1Listener());

        button2 = new Button("*");
        Button2Listener b2 = new Button2Listener();
        button2.addActionListener(new Button2Listener());

        button3 = new Button("-");
        Button3Listener b3 = new Button3Listener();
        button3.addActionListener(new Button3Listener());

        button4 = new Button("+");
        Button4Listener b4 = new Button4Listener();
        button4.addActionListener(new Button4Listener());

        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float input1 = Float.parseFloat(field1.getText());
            float input2 = Float.parseFloat(field2.getText());
            result = input1 / input2;
            repaint();
        }
    }

    class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float input3 = Float.parseFloat(field1.getText());
            float input4 = Float.parseFloat(field2.getText());
            result = input3 * input4;
            repaint();
        }
    }

    class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float input5 = Float.parseFloat(field1.getText());
            float input6 = Float.parseFloat(field2.getText());
            result = input5 - input6;
            repaint();
        }
    }

    class Button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float input7 = Float.parseFloat(field1.getText());
            float input8 = Float.parseFloat(field2.getText());
            result = input7 + input8;
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawString("result: " + result,20,40);
    }
}
