package oop.ch03.vehicles;

public class AmphibienfahrzeugImpl2 extends SchiffImpl implements Amphibienfahrzeug {
  private final AutoImpl auto;

  public AmphibienfahrzeugImpl2(double maxAutoZuladung,
                                double maxSchiffZuladung) {
    super(maxSchiffZuladung);
    this.auto = new AutoImpl(maxAutoZuladung);
  }

  @Override
  public boolean kannHierFahren(double laenge, double breite) {
    return super.kannHierFahren(laenge, breite) ||
           auto.kannHierFahren(laenge, breite);
  }

  @Override
  public double getMaxZuladung() {
    return Math.max(super.getMaxZuladung(), auto.getMaxZuladung());
  }

  @Override
  public double getAchslast() {
    return auto.getAchslast();
  }
}
