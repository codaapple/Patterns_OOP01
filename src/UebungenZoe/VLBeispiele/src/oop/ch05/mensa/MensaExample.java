package oop.ch05.mensa;

import oop.ch05.secured.AuthorizationException;

public class MensaExample {
  public static void main(String[] args) {
    VendingMachine vm1 = new VendingMachine("left", 4711);
    VendingMachine vm2 = new VendingMachine("right", 4711);
    VendingMachine tumVM = new VendingMachine("TUM Mensa", 3141);
    CashPoint unibwMensa = new CashPoint("UniBw Mensa", 4711);

    AccountCard conf = new AccountCard("conference", "33-1298", 42);
    MensaCard frankSmith = new CountCard("Frank Smith", Color.gray);
    CashCard hansMueller = new CashCard("Hans Müller", Color.green, 4711);
    CashCard peterSchmidt = new CashCard("Peter Schmidt", Color.green, 4711);
    CashCard thomasMayer = new CashCard("Thomas Mayer", Color.blue, 4711);

    deposit(vm1, hansMueller, 10);
    deposit(vm1, peterSchmidt, 5);
    deposit(vm2, thomasMayer, 2);
    deposit(tumVM, hansMueller, 10);

    System.out.println(vm1);
    System.out.println(vm2);
    System.out.println(tumVM);
    System.out.println(hansMueller);
    System.out.println(peterSchmidt);
    System.out.println(thomasMayer);
    System.out.println();

    pass(hansMueller, unibwMensa);
    System.out.println(hansMueller);
    System.out.println(unibwMensa);

    pass(frankSmith, unibwMensa);
    pass(conf, unibwMensa);
    pass(thomasMayer, unibwMensa);
    pass(hansMueller, unibwMensa);
    pass(hansMueller, unibwMensa);
    pass(hansMueller, unibwMensa);

    System.out.println(unibwMensa);
    System.out.println(hansMueller);
    System.out.println(peterSchmidt);
    System.out.println(thomasMayer);
  }

  private static void pass(MensaCard mensaCard, CashPoint cashPoint) {
    try {
      mensaCard.pass(cashPoint);
    }
    catch (RejectedException e) {
      System.out.println("rejected: " + e.getMessage());
    }
    catch (AuthorizationException e) {
      System.out.println("authrozation failed: " + e.getMessage());
    }
  }

  private static void deposit(VendingMachine vm, CashCard cashCard, int euros) {
    try {
      vm.deposit(cashCard, euros);
    }
    catch (AuthorizationException e) {
      System.out.println("authorization failed: " + e.getMessage());
    }
  }
}
