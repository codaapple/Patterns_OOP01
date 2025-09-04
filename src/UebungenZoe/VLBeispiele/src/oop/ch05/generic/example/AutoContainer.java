package oop.ch05.generic.example;

import oop.ch03.vehicles.Auto;

public class AutoContainer {
  private final double maxAchsLast;
  private Auto contained;

  public AutoContainer(double maxAchsLast) {
    this.maxAchsLast = maxAchsLast;
  }

  public Auto getContained() {
    return contained;
  }

  public void setContained(Auto auto) {
    if (auto.getAchslast() > maxAchsLast)
      throw new IllegalArgumentException("Too heavy");
    this.contained = auto;
  }
}
