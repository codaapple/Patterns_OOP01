package patterns.StatePattern_V2;

public class Übergang extends StateV2{

    public Übergang(AutomatonV2 ampel) {
        super(ampel);
    }

    @Override
    public void crosswalker() {
        System.out.println("Rot");
        ampel.setCurrentState(ampel.rot);
    }

    @Override
    public void car() {
        System.out.println("Rot");
        ampel.setCurrentState(ampel.rot);
    }

    @Override
    public void next() {
        System.out.println("Rot");
        ampel.setCurrentState(ampel.rot);
    }
}
