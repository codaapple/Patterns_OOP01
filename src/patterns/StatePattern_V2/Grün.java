package patterns.StatePattern_V2;

public class Grün extends StateV2{

    public Grün(AutomatonV2 ampel) {
        super(ampel);
    }

    @Override
    public void crosswalker() {
        System.out.println("Gelb");
        ampel.setCurrentState(ampel.gang);
    }

    @Override
    public void car() {
        System.out.println("Grün");
    }

    @Override
    public void next() {
        ampel.setCurrentState(ampel.gang);
    }
}
