import javax.swing.*;
import java.awt.*;

public class Q9 {
    public static void main(String[] args) {
        JFrame fr=new JFrame();
        fr.setBounds(60,60,500,500);
        fr.setDefaultCloseOperation(3);
        JPanel pn=new JPanel(){
            @Override
            public void paint(Graphics g) {
                Graphics2D g2=(Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(Color.black);
                g2.fillRect(10,10,50,180);
                Graphics2D g3=(Graphics2D) g.create();
                g3.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g3.setColor(Color.red);
                g3.fillOval(14,14,40,40);
                Graphics2D g4=(Graphics2D) g.create();
                g4.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g4.setColor(Color.yellow);
                g4.fillOval(14,74,40,40);
                Graphics2D g5=(Graphics2D) g.create();
                g5.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g5.setColor(Color.green);
                g5.fillOval(14,134,40,40);
                Graphics2D g6=(Graphics2D) g.create();
                g6.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g6.setColor(Color.black);
                g6.fillRect(28,180,15,500);
            }
        };
        fr.add(pn);
        fr.setVisible(true);
    }
}
