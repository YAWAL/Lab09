import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.*;

class PaintTest extends Frame {
    PaintTest(String s) {
        super(s);
        setSize(300, 300);
        setBackground(Color.WHITE);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        BufferedImage bi = new BufferedImage(40, 40, BufferedImage.TYPE_USHORT_565_RGB);
        Graphics2D big = bi.createGraphics();
        big.draw(new Line2D.Double(0.0, 0.0, 30.0, 10.0));
        big.draw(new Line2D.Double(0.0, 30.0, 10.0, 0.0));
        TexturePaint tp = new TexturePaint(bi,
                new Rectangle2D.Double(0.0, 0.0, 30.0, 10.0));
        g.setPaint(tp);
        g.fill(new Rectangle2D.Double(50, 50, 200, 200));
        GradientPaint gp = new GradientPaint(100, 100, Color.green,
                150, 150, Color.blue, true);
        g.setPaint(gp);
        g.fill(new Ellipse2D.Double(100, 100, 200, 200));
    }

    public static void main(String[] args) {
        new PaintTest(" Способи заливки");
    }
} 