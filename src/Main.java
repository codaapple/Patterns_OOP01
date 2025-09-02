import patterns.CompositePattern.BinExpr;
import patterns.CompositePattern.Const;
import patterns.CompositePattern.Mult;
import patterns.CompositePattern.Plus;
import patterns.FactoryPattern.Creator;
import patterns.FactoryPattern.Produkt;
import patterns.ItteratorPattern.Iterator;
import patterns.ItteratorPattern.LL;
import patterns.ItteratorPattern.LLIterator;
import patterns.ItteratorPattern2.ArrayList1;
import patterns.SingletonPattern.SingletonClasseChallenge;
import patterns.StatePattern_V1.G36;
import patterns.VisitorPattern.BronzCard;
import patterns.VisitorPattern.CashbackHotel;
import patterns.VisitorPattern.Creditcard;
import patterns.VisitorPattern.GoldCard;
import patterns.VisitorPattern.SilverCard;
import patterns.anything.shortInt;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {


    private final int five = 5;
    final private int six = 6;

    public static void main(String[] args) {
        //Singleton Pattern
        System.out.println("Singlton Pattern");
        SingletonClasseChallenge challange1 = SingletonClasseChallenge.getInstance(5);
        SingletonClasseChallenge challange2 = SingletonClasseChallenge.getInstance();

        System.out.println(challange1);
        System.out.println(challange2);
        System.out.println(challange1.challenge(5));

        //Composite Pattern
        System.out.println("------------------------------------");
        System.out.println("Composite Pattern");
        BinExpr plus1 = new Plus(new Const(2), new Const(1));
        BinExpr mult1 = new Mult(plus1, new Const(5));
        System.out.println(mult1 + "=" + mult1.eval());

        //Visitor Pattern
        System.out.println("------------------------------------");
        System.out.println("Visitor Pattern");
        Creditcard bCard = new BronzCard();
        Creditcard sCard = new SilverCard();
        Creditcard gCard = new GoldCard();
        List<Creditcard> Cardlist = new ArrayList<Creditcard>();
        Cardlist.add(sCard);
        Cardlist.add(gCard);
        Cardlist.add(bCard);
        CashbackHotel hotel = new CashbackHotel();
        for (Creditcard card : Cardlist) {
            System.out.print(card.toString());
            System.out.print(": ");
            card.accept(hotel);
            System.out.print("\n");
        }

        //Factory Pattern
        System.out.println("------------------------------------");
        System.out.println("Factory Pattern");

        Produkt produkt1 = Creator.createProdukt("produkt1");
        Produkt produkt2 = Creator.crea                                     teProdukt("produkt2");
        Produkt produkt3 = Creator.createProdukt("Apfel");
        //Creator.createProdukt("produkt3");
        System.out.println(produkt1.toString());
        System.out.println(produkt2.toString());
        System.out.println(produkt3.toString());

        //State Pattern
        System.out.println("------------------------------------");
        System.out.println("State Pattern");
        G36 g36 = new G36();
        g36.magazinEinführen();
        g36.verschluss();
        g36.abkrümmen();
        System.out.println(g36.getState());
        g36.magazinEntnehmen();
        g36.verschluss();
        g36.abkrümmen();
        System.out.println(g36.getState());

        //Iterator Pattern

        System.out.println("------------------------------------");
        System.out.println("Iterator Pattern");

        LL ll = new LL();
        ll.add("Sauer");
        ll.add("5");
        ll.add("zonn");
        ll.add(true);
        Iterator iterator = new LLIterator();
        while(iterator.hasNext(ll)){
            System.out.println(ll.getElements().toString());
            ll = iterator.next(ll);
        }
        System.out.println(ll.getElements().toString());

        crazyclass c1 = new crazyclass();
        c1.print();


        //Iterator Pattern2

        System.out.println("------------------------------------");
        System.out.println("Iterator Pattern2");

        ArrayList1 AL = new ArrayList1();
        AL.add(1);
        AL.add(2);
        AL.add(3);
        AL.add(true);
        AL.add("Naumann");
        AL.foreachprint();
        AL.add(4);
        AL.add(5);
        AL.add(false);
        AL.add("Sauer");
        AL.foreachprint();

        //Enum

        System.out.println("------------------------------------");
        System.out.println("Enum");

        System.out.println(shortInt.One.ordinal());
        System.out.println(shortInt.Seven.ordinal());

    }

}