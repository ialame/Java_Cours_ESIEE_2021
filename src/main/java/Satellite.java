import javax.swing.*;
import java.awt.*;

public class Satellite  extends JPanel {

        private int posX = -50;
        private int posY = -50;

        public void paintComponent(Graphics g) {
            // On redéfinit une couleur pour notre rond
            g.setColor(Color.red);
            // On le dessine aux coordonnées souhaitées
            g.fillOval(posX, posY, 50, 50);
            g.setColor(Color.green);
            g.fillOval(this.getWidth()/2-100, this.getHeight()/2-100, 200, 200);
        }

        public void setPosX(int posX) {
            this.posX = posX;
        }
        public void setPosY(int posY) {
            this.posY = posY;
        }
    }