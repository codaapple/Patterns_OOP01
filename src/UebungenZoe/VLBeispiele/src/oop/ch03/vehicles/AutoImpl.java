package oop.ch03.vehicles;

public class AutoImpl extends FahrzeugImpl implements Auto {
  public AutoImpl(double maxZuladung) {
    super(maxZuladung);
  }

  @Override
  public double getAchslast() {
    return maxZuladung;
  }

  @Override
  public boolean kannHierFahren(double laenge, double breite) {
    return aufStrasse(laenge, breite) && getGewicht() < maxZuladung;
  }

  private boolean aufStrasse(double laenge, double breite) {
    // TODO implement
    return false;
  }
}
