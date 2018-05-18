import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Polygons {
  public static void mainDraw(Graphics graphics){
    int xpoints[] = {WIDTH / 2, WIDTH / 2 + 10, WIDTH / 2 + 20, WIDTH / 2 + 10, WIDTH / 2, WIDTH / 2 + 20};
    int ypoints[] = {20, 0, 20, 40, 20, 20};
    for (int i = 0; i < 10 ; i++) {
      for (int j = 0; j < i; j++) {
        for (int k = 0; k < xpoints.length; k++) {
          xpoints[k] = xpoints[k] + 20 * j;
          drawPolygon(xpoints, ypoints, graphics);
        }
      }
      for (int j = 0; j < ypoints.length; j++) {
        ypoints[j] = ypoints[j] + 20 * i;
        xpoints[j] = xpoints[j] - 10 * i;
      }
    }



  }
  public static void drawPolygon(int[] xPoints, int[] yPoints, Graphics graphics) {
    int npoints = 6;
    graphics.drawPolygon(xPoints, yPoints, npoints);
  }

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
