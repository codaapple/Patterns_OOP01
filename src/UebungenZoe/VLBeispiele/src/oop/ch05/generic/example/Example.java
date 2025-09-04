package oop.ch05.generic.example;

import oop.ch03.vehicles.Amphibienfahrzeug;
import oop.ch03.vehicles.AmphibienfahrzeugImpl;
import oop.ch03.vehicles.Auto;
import oop.ch03.vehicles.AutoImpl;

public class Example {
  public static void main(String[] args) {
    plainTest();
    genericTest();
  }

  public static void plainTest() {
    final Amphibienfahrzeug alligator = new AmphibienfahrzeugImpl(750, 8000);
    final Auto golf = new AutoImpl(500);

    final AutoContainer c = new AutoContainer(1000);

    c.setContained(alligator);
    System.out.println("Tiefgang: " + getTiefgang(c));

    c.setContained(golf);
    System.out.println("Tiefgang: " + getTiefgang(c));
  }

  public static void genericTest() {
    final Amphibienfahrzeug alligator = new AmphibienfahrzeugImpl(750, 8000);
    final Auto golf = new AutoImpl(500);

    final GenericContainer<Amphibienfahrzeug> c1 = new GenericContainer<>(1000);

    c1.setContained(alligator);
    System.out.println("Tiefgang: " + getTiefgang(c1));

    // incompatible types: oop.ch04.vehicles.Auto cannot be converted to oop.ch04.vehicles.Amphibienfahrzeug
    // c1.setContained(golf);
    System.out.println("Tiefgang: " + getTiefgang(c1));

    final GenericContainer<Auto> c2 = new GenericContainer<>(1000);
    c2.setContained(golf);
    // no suitable method found for getTiefgang(oop.ch05.generic.example.GenericContainer<oop.ch04.vehicles.Auto>)
    // System.out.println("Tiefgang: " + getTiefgang(c2));
  }

  public static double getTiefgang(AutoContainer container) {
    final Amphibienfahrzeug contained = (Amphibienfahrzeug) container.getContained();
    return contained.getTiefgang();
  }

  public static double getTiefgang(GenericContainer<Amphibienfahrzeug> container) {
    return container.getContained().getTiefgang();
  }
}
