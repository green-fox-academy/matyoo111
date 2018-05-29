import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing5 {
  public static void mainDraw(Graphics graphics) {
    int basicsize = WIDTH / 3;
    int X = 0;
    int Y = 0;
    drawSierpinsky(X, Y, basicsize, graphics);
  }

  private static void drawSierpinsky(int x, int y, int size, Graphics graphics) {
    graphics.fillRect(x + size, y + size, size, size);

    if (size > 10) {
      size /= 3;
      drawSierpinsky(x, y, size, graphics);
      drawSierpinsky(x, y + size * 3, size, graphics);
      drawSierpinsky(x, y + size * 6, size, graphics);
      drawSierpinsky(x + size * 3, y, size, graphics);
      drawSierpinsky(x + size * 3, y + size * 6, size, graphics);
      drawSierpinsky(x + size * 6, y, size, graphics);
      drawSierpinsky(x + size * 6, y + size * 3, size, graphics);
      drawSierpinsky(x + size * 6, y + size * 6, size, graphics);

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

