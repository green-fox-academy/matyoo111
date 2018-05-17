import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics){
    Color color = null;
    int size = HEIGHT;
    int r = 255;
    int g = 0;
    int b = 0;
    int width = WIDTH;
    int height = HEIGHT / 2 - size;
    for (int i = 0; i < 5; i++) {
      r = r - 40;
      g = g + 20;
      b = b + 30;
      size = size - 50;
      color = new Color(r, g, b);
      height = height + size;
      centerBoxDrawer(size, color, graphics);
    }
  }
  public static void centerBoxDrawer(int size, Color color, Graphics graphics) {
    graphics.setColor(color);
    graphics.fillRect(WIDTH / 2 - size /2, HEIGHT / 2 - size /2, size, size);
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
