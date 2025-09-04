package oop.ch05.mensa;

import oop.ch05.secured.AuthorizationException;
import oop.ch05.secured.SecurityClient;

public class VendingMachine implements SecurityClient {
  private final int password;
  public final String name;
  private int euros;

  public VendingMachine(String name, int password) {
    this.name = name;
    this.password = password;
    this.euros = 0;
  }

  @Override
  public int challengeResponse(int challenge) {
    return challenge ^ password;
  }

  @Override
  public String toString() {
    return "Vending machine " + name + " (contains EUR " + euros + ")";
  }

  public int getEuros() {
    return euros;
  }

  public void deposit(CashCard card, int euros) throws AuthorizationException {
    if (euros <= 0)
      throw new IllegalArgumentException("Non-positive deposit");
    card.deposit(this, euros * 100);
    this.euros += euros;
  }
}
