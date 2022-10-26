// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet {
    public void paint(Graphics g) {
        int width = 980;
        int height = 630;
        int x1 = 1;
        int y1 = 640;
        int x2 = 990;
        int y2 = 640;
        g.drawRect(10, 10, width, height);
    }
        // Draw bottom-left corner


        // Draw bottom-right corner


        // Draw top-right corner


        // Draw top-left corner


        {
            // Draw 50 circles that go in a diagonal line

            int x = 20;
            int y = 20;
            int width = 30;
            int height = 30;
            for (int k = 0; k < 50; k++){
                g.drawOval(x, y, width, height);
                x += 5;
                y += 5;
            }


        }
    }

