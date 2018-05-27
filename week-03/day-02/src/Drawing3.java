import com.sun.prism.GraphicsPipeline;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;

import static java.awt.Component.LEFT_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing3 {
  public static void mainDraw(Graphics graphics) {
    int [] xpoints = {0, WIDTH, WIDTH / 2};
    int [] ypoint = {0, 0, HEIGHT};
    int npoints = 3;
    graphics.drawPolygon(xpoints, ypoint, npoints);
    int X = 0;
    int Y = 0;
    drawHex(X , Y, WIDTH, graphics);


  }

  public static void drawHex(int X, int Y, int size, Graphics graphics) { ;
    int[] xPoints = {X + size / 4, X + size / 2, X + size * 3 / 4};
    int[] yPoints = {Y + size / 2, Y, Y + size / 2};
    int npoints = 3;
    graphics.drawPolygon(xPoints, yPoints, npoints);

    if (size > 10) {
      size /= 2;
      drawHex(X , Y, size, graphics);
      drawHex(X + size , Y, size, graphics);
      drawHex(X + size / 2 , Y + size, size, graphics);
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
