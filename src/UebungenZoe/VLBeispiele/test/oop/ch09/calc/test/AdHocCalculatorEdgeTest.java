package oop.ch09.calc.test;

import oop.ch06.calc.AdHocCalculator;
import oop.ch06.calc.Ops;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdHocCalculatorEdgeTest {
  private AdHocCalculator calc;

  @Before
  public void setup() {
    calc = new AdHocCalculator();
    calc.digit(6);
    calc.binOp(Ops.MULT);
    calc.digit(7);
    calc.eval();
  }

  @Test
  public void test0() {
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(62.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(62.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test1() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(2.5457298950218306, calc.getValue(), 1e-10);
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(5.25, calc.getValue(), 1e-10);
  }

  @Test
  public void test2() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test3() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test4() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test5() {
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test6() {
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test7() {
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test8() {
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(9.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test9() {
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-5.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test11() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test12() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(0.2, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.2214027581601699, calc.getValue(), 1e-10);
  }

  @Test
  public void test13() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test14() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test15() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(-1.73927494152050099E18, calc.getValue(), 1e-10);
  }

  @Test
  public void test16() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(-1.73927494152050099E18, calc.getValue(), 1e-10);
  }

  @Test
  public void test17() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test18() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertTrue(Double.isNaN(calc.getValue()));
  }

  @Test
  public void test19() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.digit(5);
    assertEquals(25.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-25.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test20() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(51.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test21() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(2.6457513110645907, calc.getValue(), 1e-10);
  }

  @Test
  public void test22() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test23() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(0.3, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test24() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
  }
}
