package oop.ch05.mensa;

import oop.ch02.cards.Card;
import oop.ch05.secured.AuthorizationException;

public abstract class MensaCard extends Card {
  public final Color color;

  protected MensaCard(String name, Color color) {
    super(name);
    this.color = color;
  }

  @Override
  public String toString() {
    return color + " card " + getNumber() + " (" + getName() + ")";
  }

  public abstract void pass(CashPoint cashPoint) throws RejectedException, AuthorizationException;
}