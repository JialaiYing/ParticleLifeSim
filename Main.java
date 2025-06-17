import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel implements ActionListener {
    private int x = 100;
    private int y = 100;
    private int dx = 7, dy = 7;
    final int radius = 20;
    Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        Main panel = new Main();
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }

    public Main() {
        timer = new Timer(10, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLUE);
        g.fillOval(x, y, radius, radius);
    }

    public void actionPerformed(ActionEvent e) {
        x += dx;
        y += dy;

        if (x < 0 || x + radius > getWidth()) dx = -dx;
        if (y < 0 || y + radius > getHeight()) dy = -dy;

        repaint();
    }
}
