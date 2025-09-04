package oop.ch08.gui.simple;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

public class HelloWorld extends JPanel {
  public static void main(String[] args) {
    final HelloWorld pane = new HelloWorld();
    showFrame(pane, "Hello World");
  }

  private static void showFrame(Container pane, String title) {
    final JFrame frame = new JFrame(title);
    frame.setContentPane(pane);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  private HelloWorld() {
    setPreferredSize(new Dimension(200, 200));
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.LIGHT_GRAY);
    g.fillRect(10, 10, 90, 30);
    g.setColor(Color.BLACK);
    g.drawString("Hello World", 15, 30);
  }
}
