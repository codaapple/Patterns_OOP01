package oop.ch04.equality.card4;

public class ColoredCard extends Card {
  public final Color color;

  public ColoredCard(String key, Color color) {
    super(key);
    this.color = color;
  }

  @Override
  public String toString() {
    return color + " " + super.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof ColoredCard) {
      final ColoredCard that = (ColoredCard) o;
      return that.canEqual(this) &&
             this.color == that.color &&
             super.equals(that);
    }
    return false;
  }

  @Override
  public boolean canEqual(Object other) {
    return other instanceof ColoredCard;
  }
}
