import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing4 {
  public static void mainDraw(Graphics graphics) {
    int X = 0;
    int Y = 0;
    int basicsize = WIDTH;

    drawCircles(X, Y, basicsize, graphics);
  }

  private static void drawCircles(int X, int Y, int size, Graphics graphics) {
    graphics.drawOval(X, Y, size, size);

    if (size > 20) {
      size /= 2;
      drawCircles(X + size / 2, Y, size, graphics);
      drawCircles(X, Y + size * 2 / 3, size, graphics);
      drawCircles(X + size, Y + size * 2 / 3, size, graphics);
    }
  }


  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

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
