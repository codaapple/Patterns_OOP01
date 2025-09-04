package oop.ch03.vehicles;

public interface Fahrzeug {
  double getGewicht();

  double getMaxZuladung();

  boolean kannHierFahren(double laenge, double breite);
}
