import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(20, 20, 250, 20);
    graphics.setColor(new Color(120, 24,123));
    graphics.drawLine(250, 20, 250, 250);
    graphics.setColor(Color.BLUE);
    graphics.drawLine(250, 250, 20, 250);
    graphics.setColor(new Color(0, 150, 150));
    graphics.drawLine(20, 250, 20, 20);
    // Draw a box that has different colored lines on each edge.



  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
