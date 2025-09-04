package oop.ch05.mensa;

import oop.ch05.secured.AuthorizationException;
import oop.ch05.secured.SecurityClient;

public class CashPoint implements SecurityClient {
  private final int password;
  public final String name;
  private int counter;
  private int cents;

  public CashPoint(String name, int password) {
    this.name = name;
    this.password = password;
    this.counter = 0;
    this.cents = 0;
  }

  @Override
  public int challengeResponse(int challenge) {
    return challenge ^ password;
  }

  @Override
  public String toString() {
    return "Cash point " + name + " (" + getCounter() + " meals, " + getCents() + " cents charged)";
  }

  public int getCounter() {
    return counter;
  }

  public int getCents() {
    return cents;
  }

  private int getPrice(Color color) {
    return switch (color) {
      case green -> 267;
      case blue -> 357;
      case white -> 495;
      default -> 0;
    };
  }

  void count(MensaCard card) {
    counter++;
  }

  void charge(CashCard cashCard) throws AuthorizationException, RejectedException {
    final int price = getPrice(cashCard.color);
    if (cashCard.getBalance() < price)
      throw new RejectedException("insufficient payment");
    cashCard.charge(this, price);
    count(cashCard);
    cents += price;
  }

  void charge(AccountCard accountCard) {
    final int price = getPrice(accountCard.color);
    System.out.println("Charging " + price + " cents on account " + accountCard.getAccount());
    cents += price;
  }
}
