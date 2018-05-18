import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawTriangle {
  public static void mainDraw(Graphics graphics){
    int xStart = WIDTH / 2;
    int yStart = 40;
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < i; j++) {
        drawTriangle(xStart, yStart, graphics);
        xStart = xStart + 20;
      }
      xStart = WIDTH / 2 - i * 10;
      yStart = yStart + 20;
    }
  }


  public static void drawTriangle(int xinit, int yinit, Graphics graphics) {
    int xpoints[] = {xinit,xinit + 10, xinit + 20};
    int ypoints[] = {yinit, yinit - 20, yinit};
    int npoints = 3;
    graphics.drawPolygon(xpoints, ypoints, npoints);
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
