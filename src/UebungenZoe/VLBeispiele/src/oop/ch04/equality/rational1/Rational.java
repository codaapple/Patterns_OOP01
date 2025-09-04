package oop.ch04.equality.rational1;

public class Rational {
  private final int num;
  private final int denom;

  public Rational(int num, int denom) {
    int gcd = gcDivider(Math.abs(num), Math.abs(denom));
    if (denom < 0) {
      this.num = -num / gcd;
      this.denom = -denom / gcd;
    }
    else {
      this.num = num / gcd;
      this.denom = denom / gcd;
    }
  }

  public Rational(int num) {
    this(num, 1);
  }

  private int gcDivider(int x, int y) {
    return x == 0 ? y : gcDivider(y % x, x);
  }

  public int getNum() {
    return num;
  }

  public int getDenom() {
    return denom;
  }

  public Rational add(Rational r) {
    return new Rational(num * r.denom + denom * r.num, denom * r.denom);
  }

  public Rational add(int i) {
    return this.add(new Rational(i));
  }

  public Rational sub(Rational r) {
    return new Rational(num * r.denom - denom * r.num, denom * r.denom);
  }

  public Rational sub(int i) {
    return this.sub(new Rational(i));
  }

  public Rational mult(Rational r) {
    return new Rational(num * r.num, denom * r.denom);
  }

  public Rational mult(int i) {
    return this.mult(new Rational(i));
  }

  public Rational div(Rational r) {
    return new Rational(num * r.denom, denom * r.num);
  }

  public Rational div(int i) {
    return this.div(new Rational(i));
  }

  public boolean lessThan(Rational r) {
    return (this.sub(r).num < 0);
  }

  public boolean lessThan(int i) {
    return (this.sub(i).num < 0);
  }

  public boolean greaterThan(Rational r) {
    return (this.sub(r).num > 0);
  }

  public boolean greaterThan(int i) {
    return (this.sub(i).num > 0);
  }

  public boolean lessThanOrEqual(Rational r) {
    return (this.sub(r).num <= 0);
  }

  public boolean lessThanOrEqual(int i) {
    return (this.sub(i).num <= 0);
  }

  public boolean greaterThanOrEqual(Rational r) {
    return (this.sub(r).num <= 0);
  }

  public boolean greaterThanOrEqual(int i) {
    return (this.sub(i).num <= 0);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o instanceof Rational) {
      final Rational that = (Rational) o;
      return this.denom == that.denom && this.num == that.num;
    }
    return false;
  }

  public boolean equals(int i) {
    return this.equals(new Rational(i));
  }

  @Override
  public String toString() {
    return denom == 1 ? "" + num : num + "/" + denom;
  }
}
