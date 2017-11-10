import java.awt.*;
import java.awt.event.*;

class GraphTest extends Frame {
    GraphTest(String s) {
        super(s);
    }

    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        g.setBackground(Color.WHITE);
        g.drawRect(45,20, 200 , 45);
        g.draw3DRect(56,76,35,35,true);
        g.drawOval(150, 100, 150, 200);
        g.drawArc(100, 100, 0, 360,1234,435);
        g.drawRoundRect(45,34,65,23,65,5);
        g.drawPolyline(new int[]{10, 100}, new int[]{15, 88}, 55);
        g.drawPolygon(new int[]{1, 3}, new int[]{5, 8}, 5);
    }

    public static void main(String[] args) {
        GraphTest f = new GraphTest(" Приклад рисування");
        f.setBounds(0, 0, 500, 300);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }
} 