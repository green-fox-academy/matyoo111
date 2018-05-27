import com.sun.prism.GraphicsPipeline;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.Component.LEFT_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing1 {
  public static void mainDraw(Graphics graphics) {
    int X = 0;
    int Y = 0;
    drawRects(X , Y, 400, graphics);


  }

  public static void drawRects(int X, int Y, int size, Graphics graphics) {
    size /= 3;
    graphics.drawRect(X + size, Y, size, size);
    graphics.drawRect(X + size * 2, Y + size, size, size);
    graphics.drawRect(X, Y + size, size, size);
    graphics.drawRect(X + size, Y + size * 2, size, size);

    if (size > 3) {
      drawRects(X, Y + size, size, graphics);
      drawRects(X + size, Y, size, graphics);
      drawRects(X + size * 2, Y + size, size, graphics);
      drawRects(X + size, Y + size * 2, size, graphics);
    }
  }






  // Don't touch the code below
  static int WIDTH = 900;
  static int HEIGHT = 900;

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
