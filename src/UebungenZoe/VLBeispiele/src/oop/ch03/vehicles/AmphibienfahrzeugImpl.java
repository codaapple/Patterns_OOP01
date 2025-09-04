package oop.ch03.vehicles;

public class AmphibienfahrzeugImpl extends AutoImpl implements Amphibienfahrzeug {
  private final SchiffImpl schiff;

  public AmphibienfahrzeugImpl(double maxAutoZuladung,
                               double maxSchiffZuladung) {
    super(maxAutoZuladung);
    this.schiff = new SchiffImpl(maxSchiffZuladung);
  }

  @Override
  public boolean kannHierFahren(double laenge, double breite) {
    return super.kannHierFahren(laenge, breite) ||
           schiff.kannHierFahren(laenge, breite);
  }

  @Override
  public double getMaxZuladung() {
    return Math.max(super.getMaxZuladung(), schiff.getMaxZuladung());
  }

  @Override
  public double getTiefgang() {
    return schiff.getTiefgang();
  }
}
