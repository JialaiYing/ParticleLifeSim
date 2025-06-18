import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Particle {
    private int x;
    private int y;
    private int dx, dy;
    private final int radius;
    private final Color color;
    Timer timer;

    public Particle(int x, int y, int dx, int dy, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = radius;
        this.color = color;
    }

    public void move(int width, int height) {
        x += dx;
        y += dy;

        if (x < 0 || x + radius >= width){
            dx = -dx;
        }
        if (y < 0 || y + radius >= height){
            dy = -dy;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}
