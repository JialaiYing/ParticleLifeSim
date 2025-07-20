import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel implements ActionListener {
    private Particle blue;
    private Particle red;
    private Timer timer;

    public Main() {
        blue = new Particle(100, 100, 7, 7, 20, Color.BLUE, 0);
        red = new Particle(100, 38, 18, -7, 20, Color.RED, 0);
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

    public void colorMatrix(){
        int[][] colors = new int[2][2];
        for(int x = 0; x < colors.length; x++)
        {
            for(int y = 0; y < colors[0].length; y++)
            {
                colors[x][y] = 0;
            }
        }
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

