import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Boule boule;
    public Fenetre(){
        setTitle("Ma fenêtre Java");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        boule = new Boule(20,20,75,75);
        setContentPane(boule);
        //Container panneau = getContentPane();
        setVisible(true);


    }
    public static void main(String[] str){
        Fenetre f =new Fenetre();
        for(int i=0;i<100;i++) {
            f.boule.setX(100);
            f.boule.setX(200);

        }
    }
    class Boule extends JPanel{
        int x=0,y=0,w=100,h=100;
        public Boule(int x, int y, int w, int h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setW(int w) {
            this.w = w;
        }

        public void setH(int h) {
            this.h = h;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            System.out.println("Je suis exécutée !");
            g.fillOval(x,y,w,h);
        }
    }
}
