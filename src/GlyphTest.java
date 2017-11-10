import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.event.*;

class GlyphTest extends Frame {
    GlyphTest(String s) {
        super(s);
        setSize(400, 150);
        setBackground(Color.WHITE);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics gr) {
        int h = 5;
        Graphics2D g = (Graphics2D) gr;
        FontRenderContext frc = g.getFontRenderContext();
        Font f = new Font("Serif", Font.BOLD, 30);
        GlyphVector gv = f.createGlyphVector(frc, "Танцюючий текст");
        int len = gv.getNumGlyphs();
        for (int i = 0; i < len; i++) {
            Point2D.Double p = new Point2D.Double(25 * i, h = -h);
            gv.setGlyphPosition(i, p);
        }
        g.drawGlyphVector(gv, 10,100);
        System.out.println(gv.getNumGlyphs());
    }

    public static void main(String[] args) {
        new GlyphTest(" Виведення окремих символів");
    }

}