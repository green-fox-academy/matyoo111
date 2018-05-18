import javax.swing.*;

import java.awt.*;

import static java.awt.Component.LEFT_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    int xInit = 0;
    int yInit = 0;
    int xEnd = WIDTH;
    int yEnd = 0;
    Color color = new Color(219, 102, 201);
    for (int i = 0; i < WIDTH / 20 + 1; i++) {
      drawLine(xInit, yInit, xEnd, yEnd, color, graphics);
      xInit = xInit + 20;
      yEnd= yEnd + 20;
    }
    color = Color.GREEN;
    xInit = 0;
    yInit = 0;
    xEnd = 0;
    yEnd = HEIGHT;
    for (int i = 0; i < HEIGHT / 20 + 1; i++) {
      drawLine(xInit, yInit, xEnd, yEnd, color, graphics);
      yInit = yInit + 20;
      xEnd = xEnd + 20;
    }



  }
  public static void drawLine(int xInit, int yInit, int xEnd, int yEnd, Color color, Graphics graphics) {
    graphics.setColor(color);
    graphics.drawLine(xInit, yInit, xEnd, yEnd);
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
