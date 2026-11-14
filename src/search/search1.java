package search;


import javax.swing.JTextField;
import java.awt.*;
import java.awt.color.ColorSpace;

public class search1 extends  JTextField{
    public search1()
    {}
    private String hint = "Search by Doctor name";
    @Override
    public void paint(Graphics g) 
    {
        super.paint(g);
        if (getText().length() == 0) 
        {
            int h = getHeight();
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins=getInsets();
            FontMetrics fm = g.getFontMetrics();
            g.setColor(Color.gray);
            g.drawString(hint,ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }
    }
}
