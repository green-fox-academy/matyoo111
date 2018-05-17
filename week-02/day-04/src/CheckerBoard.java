import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    int size = 30;
    for (int i = 0; i < HEIGHT / size; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < WIDTH / size; j++) {
          graphics.fillRect(i * size, j * size *2 , size, size);
        }
      }
      else {
        for (int j = 0; j < WIDTH / size; j++) {
          graphics.fillRect(i * size, size + j * size * 2, size, size);
        }
      }
    }
  }
  // Don't touch the code below
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
