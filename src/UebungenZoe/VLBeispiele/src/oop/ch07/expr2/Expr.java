package oop.ch07.expr2;

public interface Expr {
  <T> T accept(Visitor<T> visitor);
}

