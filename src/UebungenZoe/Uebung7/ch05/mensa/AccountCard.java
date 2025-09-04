package oop.ch05.mensa;

import oop.ch05.secured.AuthorizationException;
import oop.ch05.secured.SecuredContent;
import oop.ch05.secured.SecurityClient;

public class AccountCard extends MensaCard {
  private final SecuredContent account;

  public AccountCard(String key, String account, int password) {
    super(key, Color.white);
    this.account = new SecuredContent(password, account);
  }

  public String getAccount() {
    return (String) account.getContent();
  }

  public void setAccount(SecurityClient client, String account) throws AuthorizationException {
    if (account == null || account.trim().length() == 0)
      throw new IllegalArgumentException("Invalid account " + account);
    this.account.setContent(client, account);
  }

  @Override
  public String toString() {
    return super.toString() + " for account " + account.getContent();
  }

  @Override
  public void pass(CashPoint cashPoint) {
    cashPoint.charge(this);
  }
}