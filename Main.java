import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel implements ActionListener {
    private Particle blue;
    private Particle red;
    private Timer timer;

    public Main() {
        blue = new Particle(100, 100, 7, 7, 20, Color.BLUE);
        red = new Particle(100, 38, 7, -7, 20, Color.RED);
        timer = new Timer(10, this);
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        Main panel = new Main();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        blue.draw(g);
        red.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        blue.move(getWidth(), getHeight());
        red.move(getWidth(), getHeight());
        repaint();
    }
}


//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.WHITE);
//        g.fillRect(0, 0, getWidth(), getHeight());
//        g.setColor(Color.BLUE);
//        g.fillOval(x, y, radius, radius);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        x += dx;
//        y += dy;
//
//        if (x < 0 || x + radius > getWidth()) dx = -dx;
//        if (y < 0 || y + radius > getHeight()) dy = -dy;
//
//        repaint();
//    }

