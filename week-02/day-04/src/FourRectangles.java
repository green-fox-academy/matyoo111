import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){
    int x = 0;
    int y = 0;
    int width = 0;
    int height = 0;
    int r = 0;
    int b = 0;
    int g = 0;
    for (int i = 0; i < 4; i++) {
      r = (int)(Math.random() * 255);
      b = (int)(Math.random() * 255);
      g = (int)(Math.random() * 255);
      x = (int)(Math.random() * 321);
      y = (int)(Math.random() * 344);
      width = (int)(Math.random() * WIDTH - x -1);
      height = (int)(Math.random() * HEIGHT - y -1);
      graphics.setColor(new Color(r, b, g));
      graphics.drawRect(x, y, width, height);
    }
    // draw four different size and color rectangles.
    // avoid code duplication.


  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
