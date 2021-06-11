import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
    public Boule boule;
    public Fenetre(){
        setTitle("Ma fenêtre Java");
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        boule = new Boule();
        setContentPane(boule);
        setVisible(true);


    }
    public static void main(String[] str){
        Fenetre f =new Fenetre();
        for(int i=0;i<200;i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            f.boule.setPosX(2*i);
            f.boule.setPosY(2*i);
            f.boule.repaint();

        }
    }
}
