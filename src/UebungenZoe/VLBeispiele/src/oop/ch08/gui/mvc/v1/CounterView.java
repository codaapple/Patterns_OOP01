package oop.ch08.gui.mvc.v1;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

class CounterView extends JPanel {
  private final CounterModel model;

  CounterView(CounterModel model) {
    this.model = model;
    model.setView(this);
    setPreferredSize(new Dimension(200, 100));
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.LIGHT_GRAY);
    g.fillRect(10, 10, 100, 30);
    g.setColor(Color.BLACK);
    g.drawString("Push me! (" + model.getCounter() + ")", 15, 30);
  }

  public void update() {
    repaint();
  }
}
