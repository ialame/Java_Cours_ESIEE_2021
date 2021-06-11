import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gribouille extends JFrame {
    int xd,yd;
    public Gribouille(){
        addMouseListener(new Appuyeur());
        addMouseMotionListener(new Dragueur());
    }
    public class Appuyeur extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            xd=e.getX();
            yd=e.getY();
        }
    }

    class Dragueur extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            int x= e.getX();
            int y=e.getY();
            Graphics g = getGraphics();
            g.drawLine(xd,yd,x,y);
            xd=x;
            yd=y;
            g.dispose();
        }
    }
    public static void main(String[] str){
        Gribouille gribouille = new Gribouille();
        gribouille.setBounds(0,100,450,300);
        gribouille.setVisible(true);
    }

}

