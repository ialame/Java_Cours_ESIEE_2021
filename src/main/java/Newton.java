import javax.swing.JFrame;

public class Newton  extends JFrame {

    public static void main(String[] args) {
        new Newton();
    }
    private Satellite pan = new Satellite();

    public Newton() {
        this.setTitle("Animation");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pan);
        this.setVisible(true);

        go();
    }

    private void go() {
        double a=500,b=500;
        double x=900;
        double y=500;
        double alpha=Math.PI/2;
        double V = 600;
        double Vx=V*Math.cos(alpha),Vy=-V*Math.sin(alpha);
        double dVx,dVy;
        double dx,dy;
        double g=5,Ax,Ay;
        double dt=0.01;
        while (true) {
            double r = Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
            double R=640;
            double A = g*Math.pow(R/r,2);
            Ax=-A*(x-a)/r;Ay=-A*(y-a)/r;
            dVx=Ax;dVy=Ay;
            Vx=Vx+dVx; Vy=Vy+dVy;
            dx = Vx*dt;
            dy = Vy*dt;

            x=x+dx;
            y=y+dy;
            //System.out.println(x+" "+y);
            pan.setPosX((int)x);
            pan.setPosY((int)y);


            // On redessine notre Panneau
            pan.repaint();
            // Comme on dit : la pause s'impose ! Ici, 20 millièmes de seconde
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}