package oop.ch09.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ExceptionTest {
  @Test
  public void testDivZero1() {
    int zero = 0;
    int result = 4 / zero;
    assertTrue(true);
  }

  @Test
  public void testDivZero2() {
    int zero = 0;
    try {
      int result = 4 / zero;
      fail("ArithmeticException kam nicht");
    }
    catch (ArithmeticException ex) {
      assertEquals("/ by zero", ex.getMessage());
    }
  }

  @Test(expected = ArithmeticException.class)
  public void testDivZero2b() {
    int zero = 0;
    int result = 4 / zero;
  }
}
