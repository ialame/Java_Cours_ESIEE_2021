import javax.swing.JFrame;

public class ProblemeDeTir extends JFrame {

    public static void main(String[] args) {
        new ProblemeDeTir();
    }

    private Boule pan = new Boule();

    public ProblemeDeTir() {
        this.setTitle("Animation");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setVisible(true);

        go();
    }

    private void go() {
        double x=100;
        double y=100;
        double alpha=Math.PI/6;
        double V = 200;
        double Vx=V*Math.cos(alpha),Vy=-V*Math.sin(alpha);
        double dVx,dVy;
        double dx,dy;
        double g=5,Ax,Ay;
        double dt=0.01;
        while (true) {
            Ax=0;Ay=g;
            dVx=Ax;dVy=Ay;
            Vx=Vx+dVx; Vy=Vy+dVy;
            if (y>1000-50) Vy=-Vy;
            if (x>1000-50 || x<0) Vx=-Vx;
            dx = Vx*dt;
            dy = Vy*dt;

            x=x+dx;
            y=y+dy;
            //System.out.println(x+" "+y);
            pan.setPosX((int)x);
            pan.setPosY((int)y);

            // On redessine notre Panneau
            pan.repaint();
            // Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}