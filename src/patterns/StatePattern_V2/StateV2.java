package patterns.StatePattern_V2;

public abstract class StateV2 {

    protected final AutomatonV2 ampel;
    public StateV2(AutomatonV2 ampel) {
        this.ampel = ampel;
    }

    public abstract void crosswalker();
    public abstract void car();
    public abstract void next();
}
