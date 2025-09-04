package oop.ch03.vehicles;

public abstract class FahrzeugImpl implements Fahrzeug {
  protected final double maxZuladung;

  protected FahrzeugImpl(double maxZuladung) {
    this.maxZuladung = maxZuladung;
  }

  @Override
  public double getGewicht() {
    // TODO implement
    return 1000.;
  }

  @Override
  public double getMaxZuladung() {
    return maxZuladung;
  }
}
