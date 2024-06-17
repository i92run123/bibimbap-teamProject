import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class DrawRect extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        g.drawRect(20, 20, 100, 100);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawRect panel = new DrawRect();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200, 200));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}