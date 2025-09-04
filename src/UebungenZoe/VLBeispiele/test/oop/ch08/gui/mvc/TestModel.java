package oop.ch08.gui.mvc;

import oop.ch08.gui.mvc.model.CounterModel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestModel {
  @Test
  public void testInitWithZero() {
    final CounterModel model = new CounterModel();
    assertEquals(0, model.getCounter());
  }

  @Test
  public void testInc() {
    final CounterModel model = new CounterModel();
    int counter = model.getCounter();
    model.increment();
    assertEquals(++counter, model.getCounter());
    model.increment();
    assertEquals(++counter, model.getCounter());
  }
}
