import java.awt.*;
import java.awt.event.*;

class Hello extends Frame {
    Hello(String s) {
        super(s);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(111,200, 111));
        g.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
        g.drawString("Hello, XXI century World!", 20, 100);
        g.drawLine(0,0,20,20);
        g.draw3DRect(20,20,20,20,false);
    }

    public static void main(String[] args) {
        Frame f = new Hello("Вітаю тебе, XXI століття!");
        f.setSize(400, 150);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
}