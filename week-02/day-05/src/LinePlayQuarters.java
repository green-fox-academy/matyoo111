import javax.swing.*;

import java.awt.*;

import static java.awt.Component.LEFT_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    int divide = 1;
    int xInit = 0;
    int yInit = 0;
    int xEnd = WIDTH / divide;
    int yEnd = HEIGHT / divide;
    for (int i = 0; i < divide; i++) {
      for (int j = 0; j < divide; j++) {
        drawLinePlay(divide, xInit, yInit, xEnd, yEnd, graphics);
        yInit = 0;
        xInit = xInit + (WIDTH / divide) * j;
        yEnd = yEnd + (HEIGHT / divide) * j;
        xEnd = 0;
        }
        yEnd = yInit + (WIDTH / divide) * i;
        xInit = xInit + (WIDTH / divide) * i;
        yInit = yInit + HEIGHT / divide * i;
        xEnd = xEnd + (WIDTH / divide) * i;
    }
  }
  public static void drawLinePlay(int divide, int xInit, int yInit, int xEnd, int yEnd,Graphics graphics) {
    int xEnd1 = xEnd;
    int yEnd1 = yEnd;
    int xInit1 = xInit;
    int yInit1 = yInit;
    Color color = new Color(219, 102, 201);
    for (int i = 0; i <= WIDTH / 20; i++) {
      drawLine(xInit1, yInit1, xEnd1, yEnd1, color, graphics);
      xInit1 = xInit1 + 20 / divide;
      yEnd1 = yEnd1 + 20 / divide;
    }
    color = Color.GREEN;
    int xEnd2 = xEnd;
    int yEnd2 = yEnd;
    int xInit2 = xInit;
    int yInit2 = yInit;
    for (int i = 0; i <= HEIGHT / 20; i++) {
      drawLine(xInit2, yInit2, xEnd2, yEnd2, color, graphics);
      yInit2 = yInit2 + 20 / divide;
      xEnd2 = xEnd2 + 20 / divide;
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
