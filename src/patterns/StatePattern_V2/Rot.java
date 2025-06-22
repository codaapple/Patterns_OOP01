package patterns.StatePattern_V2;

public class Rot extends StateV2{

    public Rot(AutomatonV2 ampel) {
        super(ampel);
    }

    @Override
    public void crosswalker() {
        System.out.println("Rot");
    }

    @Override
    public void car() {
        System.out.println("Grün");
        ampel.setCurrentState(ampel.grün);
    }

    @Override
    public void next() {
        System.out.println("Grün");
        ampel.setCurrentState(ampel.grün);
    }
}
