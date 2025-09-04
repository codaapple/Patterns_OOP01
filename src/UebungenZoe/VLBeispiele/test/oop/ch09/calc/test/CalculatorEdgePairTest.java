package oop.ch09.calc.test;

import oop.ch06.calc.Ops;
import oop.ch07.calc.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorEdgePairTest {
  private Calculator calc;

  @Before
  public void setup() {
    calc = new Calculator();
    calc.digit(6);
    calc.binOp(Ops.MULT);
    calc.digit(7);
    calc.eval();
  }

  @Test
  public void test0() {
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.digit(5);
    assertEquals(45.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(45.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-45.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(-45.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(-51.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(-51.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(-51.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(-102.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(5.0345753587649823E-45, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-5.0345753587649823E-45, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(0.3, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(-1.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-5.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(148.4131591025766, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(0.03368973499542734, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(0.03368973499542734, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(0.1835476368560144, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test1() {
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(0.6, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1096.6331584284585, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(-1093.6331584284585, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1196033.485214206, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test2() {
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test3() {
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test4() {
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test5() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-9.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(51.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(51.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(51.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test6() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test7() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test8() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.SQRT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test9() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test10() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(35.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test11() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test12() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(93.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(2.451245542920086E40, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test13() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test14() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test15() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test16() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(84.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(84.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test17() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1764.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(1764.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test18() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test19() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test20() {
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test21() {
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(20.085536923187668, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test22() {
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test23() {
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-6.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(-6.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test24() {
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test25() {
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(6.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test26() {
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test27() {
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(7.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test28() {
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(2.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test29() {
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test30() {
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test31() {
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test32() {
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test33() {
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test34() {
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(69.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(69.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-69.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test35() {
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(6.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test36() {
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test37() {
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test38() {
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(2.3, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(2.3, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(2.3, calc.getValue(), 1e-10);
  }

  @Test
  public void test39() {
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test40() {
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test41() {
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test42() {
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test43() {
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test44() {
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test45() {
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test46() {
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(12.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(12.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(3.4641016151377544, calc.getValue(), 1e-10);
  }

  @Test
  public void test47() {
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test48() {
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test49() {
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(8103.083927575384, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test50() {
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.digit(8);
    assertEquals(78.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(8.831760866327848, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test51() {
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test52() {
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(72.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test53() {
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(64.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test54() {
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(421.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test62() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test63() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test64() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test65() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test66() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(-0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test67() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test68() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test69() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test70() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test71() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(0.3, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(0.33, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.SQRT);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test72() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test73() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test74() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test75() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(0.7, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(0.7, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test76() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test77() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test78() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(0.9, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(2.45960311115695, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test79() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test80() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test81() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test82() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test83() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test84() {
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test85() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-4.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(0.01831563888873418, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(4.7, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(109.94717245212352, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test86() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(652.4540390039687, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test87() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(2.5457298950218306, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test88() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(2.5457298950218306, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(12.752532700090239, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(29.24746729990976, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test89() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.SQRT);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test90() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(35.51925930159214, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test91() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test92() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(0.3, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test93() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-1.73927494152050099E18, calc.getValue(), 1e-10);
  }

  @Test
  public void test94() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(2.5457298950218306, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertTrue(Double.isNaN(calc.getValue()));
    calc.digit(6);
    assertTrue(Double.isNaN(calc.getValue()));
  }

  @Test
  public void test95() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test96() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test97() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(-1764.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test98() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test99() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(2.4147993510032952E-17, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(2.4147993510032952E-17, calc.getValue(), 1e-10);
  }

  @Test
  public void test100() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test101() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(48.48074069840786, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.1347969605334383E21, calc.getValue(), 1e-10);
  }

  @Test
  public void test102() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.SQRT);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test103() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(51.0, calc.getValue(), 1e-10);
    calc.digit(5);
    assertEquals(515.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(-473.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(-473.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test104() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(272.19110933313016, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test105() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test106() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(84.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test107() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(7.304954754386104E19, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test108() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test109() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test110() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.48074069840786, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(168.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test111() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test112() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.73927494152050099E18, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(44.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test113() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test114() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MINUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test115() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(252.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(2.7682763318657856E109, calc.getValue(), 1e-10);
  }

  @Test
  public void test116() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test117() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test118() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test119() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(252.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test120() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test121() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(43.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(43.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test122() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test123() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test124() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(36.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test125() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test126() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test127() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(41.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(6.4031242374328485, calc.getValue(), 1e-10);
  }

  @Test
  public void test128() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(5);
    assertEquals(5.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(54.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test129() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(126.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test130() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(2.8284271247461903, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(44.82842712474619, calc.getValue(), 1e-10);
  }

  @Test
  public void test131() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(9.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.DIV);
    assertEquals(33.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test132() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-6.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test133() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(8);
    assertEquals(8.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(2980.9579870417283, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test134() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertTrue(Double.isNaN(calc.getValue()));
  }

  @Test
  public void test135() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test136() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(4);
    assertEquals(4.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test137() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(2);
    assertEquals(2.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(27.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(27.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test138() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(31.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(73.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test139() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(1);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(43.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-43.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test140() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(20.085536923187668, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test141() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
    calc.digit(5);
    assertEquals(75.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test142() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(3);
    assertEquals(3.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test143() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.PLUS);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test144() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test145() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test146() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test147() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertTrue(Double.isNaN(calc.getValue()));
    calc.binOp(Ops.MINUS);
    assertTrue(Double.isNaN(calc.getValue()));
  }

  @Test
  public void test148() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.binOp(Ops.MULT);
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test149() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test150() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(6);
    assertEquals(0.6, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test151() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test152() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test153() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.clear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test154() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.EXP);
    assertEquals(1.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-1.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test155() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(4);
    assertEquals(0.4, calc.getValue(), 1e-10);
    calc.binOp(Ops.MINUS);
    assertEquals(41.6, calc.getValue(), 1e-10);
  }

  @Test
  public void test156() {
    calc.binOp(Ops.PLUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.unOp(Ops.SQRT);
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(7.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test157() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.eval();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
  }

  @Test
  public void test158() {
    calc.binOp(Ops.DIV);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.digit(6);
    assertEquals(6.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test159() {
    calc.binOp(Ops.MINUS);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.allClear();
    assertEquals(0.0, calc.getValue(), 1e-20);
    calc.unOp(Ops.CHANGE_SIGN);
    assertEquals(-0.0, calc.getValue(), 1e-10);
  }

  @Test
  public void test160() {
    calc.binOp(Ops.MULT);
    assertEquals(42.0, calc.getValue(), 1e-10);
    calc.dot();
    assertEquals(0.0, calc.getValue(), 1e-10);
    calc.digit(9);
    assertEquals(0.9, calc.getValue(), 1e-10);
    calc.digit(7);
    assertEquals(0.97, calc.getValue(), 1e-10);
  }
}
