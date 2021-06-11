import javax.swing.*;
import java.awt.*;

public class Boule extends JPanel {

    private int posX ;
    private int posY ;

    public void paintComponent(Graphics g) {
        // On redéfinit une couleur pour notre rond
        g.setColor(Color.red);
        // On le dessine aux coordonnées souhaitées
        g.fillOval(posX, posY, 50, 50);

    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
}
