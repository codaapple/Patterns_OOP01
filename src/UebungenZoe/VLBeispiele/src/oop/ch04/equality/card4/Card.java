package oop.ch04.equality.card4;

/**
 * Represents any card with a name and a unique serial number.
 *
 * @author Mark Minas
 */
public class Card {
  /**
   * The name of this card.
   */
  private final String name;

  /**
   * Counts the number of instantiations of this class.
   */
  private static int counter = 0;

  /**
   * The unique serial number of this card.
   */
  private final int number;

  /**
   * Creates a new card with the specified name.
   *
   * @param name the name of this card
   */
  public Card(String name) {
    if (name == null)
      throw new NullPointerException("name is null");
    this.name = name;
    this.number = ++counter;
  }

  /**
   * Creates a new card for a student with the specified number.
   *
   * @param num the student's number
   */
  public Card(int num) {
    this("MatrNr. " + num);
  }

  /**
   * Returns the name of this card.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the serial number of this card.
   *
   * @return the serial number
   */
  public int getNumber() {
    return number;
  }

  /**
   * Returns the number of instantiations of this class.
   *
   * @return the number of instantiations.
   */
  public static int getCounter() {
    return counter;
  }

  /**
   * Returns a string representation of this card.
   */
  @Override
  public String toString() {
    return "Card " + name + " (no " + number + ")";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Card) {
      final Card that = (Card) o;
      return that.canEqual(this) && this.name.equals(that.name);
    }
    return false;
  }

  public boolean canEqual(Object other) {
    return other instanceof Card;
  }
}
