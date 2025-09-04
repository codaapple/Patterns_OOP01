package oop.ch05.generic.example;

import oop.ch03.vehicles.Auto;

public class GenericContainer<A extends Auto> {
  private final double maxAchsLast;
  private A contained;

  public GenericContainer(double maxAchsLast) {
    this.maxAchsLast = maxAchsLast;
  }

  public A getContained() {
    return contained;
  }

  public void setContained(A auto) {
    if (auto.getAchslast() > maxAchsLast)
      throw new IllegalArgumentException("Too heavy");
    this.contained = auto;
  }
}
