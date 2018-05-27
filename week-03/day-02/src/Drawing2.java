import com.sun.prism.GraphicsPipeline;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.Component.LEFT_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing2 {
  public static void mainDraw(Graphics graphics) {
    int X = 0;
    int Y = 0;
    int repetition = 5;
    drawHex(X , Y, 400, repetition, graphics);


  }

  public static void drawHex(int X, int Y, int size, int repetition, Graphics graphics) { ;
    int[] xPoints = {X, X + size / 4, X + size * 3 / 4, X + size, X + size * 3 / 4, X + size / 4};
    int[] yPoints = {Y + size / 2, Y, Y, Y + size / 2, Y + size, Y + size};
    int npoints = 6;
    graphics.drawPolygon(xPoints, yPoints, npoints);

    if (repetition > 0) {
      size /= 2;
      drawHex(X + size / 4, Y, size, repetition - 1, graphics);
      drawHex(X + size / 4, Y + size, size, repetition - 1, graphics);
      drawHex(X + size, Y + size / 2, size, repetition - 1, graphics);
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

