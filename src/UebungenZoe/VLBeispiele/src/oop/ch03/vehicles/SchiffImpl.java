package oop.ch03.vehicles;

public class SchiffImpl extends FahrzeugImpl implements Schiff {
  public SchiffImpl(double maxZuladung) {
    super(maxZuladung);
  }

  @Override
  public double getTiefgang() {
    // TODO implement
    return 1.;
  }

  @Override
  public boolean kannHierFahren(double laenge, double breite) {
    return aufWasser(laenge, breite) && getGewicht() < maxZuladung;
  }

  private boolean aufWasser(double laenge, double breite) {
    // TODO implement
    return false;
  }
}
