package oop.ch08.gui.calc;

import oop.ch06.calc.Ops;
import oop.ch06.observer.Observer;
import oop.ch07.calc.Calculator;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

class CalcGUI extends JPanel implements Observer {
  private static final int COLUMNS = 4;
  private final Calculator calc;
  private final JTextField display = new JTextField();
  private int count;

  CalcGUI(Calculator calc) {
    this.calc = calc;
    calc.addObserver(this);
    setLayout(new GridBagLayout());
    addDisplay();
    addButton("±", e -> calc.unOp(Ops.CHANGE_SIGN));
    addButton("√", e -> calc.unOp(Ops.SQRT));
    addButton("C", e -> calc.clear());
    addButton("AC", e -> calc.allClear());
    addButton("7", e -> calc.digit(7));
    addButton("8", e -> calc.digit(8));
    addButton("9", e -> calc.digit(9));
    addButton("+", e -> calc.binOp(Ops.PLUS));
    addButton("4", e -> calc.digit(4));
    addButton("5", e -> calc.digit(5));
    addButton("6", e -> calc.digit(6));
    addButton("-", e -> calc.binOp(Ops.MINUS));
    addButton("1", e -> calc.digit(1));
    addButton("2", e -> calc.digit(2));
    addButton("3", e -> calc.digit(3));
    addButton("*", e -> calc.binOp(Ops.MULT));
    addButton("0", e -> calc.digit(0));
    addButton(".", e -> calc.dot());
    addButton("=", e -> calc.eval());
    addButton("/", e -> calc.binOp(Ops.DIV));
    update();
  }

  private void addDisplay() {
    display.setEditable(false);
    display.setHorizontalAlignment(SwingConstants.TRAILING);
    add(display, makeConstraint(COLUMNS));
  }

  private void addButton(String label, ActionListener listener) {
    final JButton button = new JButton(label);
    button.addActionListener(listener);
    add(button, makeConstraint(1));
  }

  private GridBagConstraints makeConstraint(int span) {
    final GridBagConstraints c = new GridBagConstraints();
    c.gridx = count % COLUMNS;
    c.gridy = count / COLUMNS;
    c.gridwidth = span;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 0.5;
    c.weighty = 0.5;
    count += span;
    return c;
  }

  @Override
  public void update() {
    display.setText(String.valueOf(calc.getValue()));
  }
}
