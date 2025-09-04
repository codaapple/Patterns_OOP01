package oop.ch03.vehicles;

import java.util.List;

public class AmphibienBsp {
  public static void main(String[] args) {
    final Auto golf = new AutoImpl(500);
    final Schiff titanic = new SchiffImpl(53150E3);
    final Amphibienfahrzeug alligator = new AmphibienfahrzeugImpl(750, 8000);

    System.out.println("Fahrzeuge:");
    final List<Fahrzeug> fahrzeuge = List.of(golf, titanic, alligator);
    for (Fahrzeug fz : fahrzeuge)
      System.out.println(fz + ", zuladung: " + fz.getMaxZuladung());

    System.out.println("Autos:");
    final List<Auto> autos = List.of(golf, alligator);
    for (Auto auto : autos)
      System.out.println(auto + ", zuladung: " + auto.getMaxZuladung());

    System.out.println("Schiffe:");
    final List<Schiff> schiffe = List.of(titanic, alligator);
    for (Schiff schiff : schiffe)
      System.out.println(schiff + ", zuladung: " + schiff.getMaxZuladung());
  }
}
