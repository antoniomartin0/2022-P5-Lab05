import java.applet.Applet;
import java.awt.*;
import java.util.Random;
public class Temp extends Applet {
    public void paint(Graphics g) {
        Random rand = new Random(7442);
        int x1 = rand.nextInt(1000);
        int y1 = rand.nextInt(650);
        int x2 = rand.nextInt(1000);
        int y2 = rand.nextInt(650);
        g.drawLine(x1, y1, x2, y2);

        }
    }
}