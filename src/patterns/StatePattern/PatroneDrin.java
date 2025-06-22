package patterns.StatePattern;

public class PatroneDrin implements State{
    @Override
    public void next(G36 g) {
        System.out.println("Patrone auswerfen lassn");
        g.setState(new Gespannt());
    }

    @Override
    public void prev(G36 g) {
        g.setState(new Fertigeladen());
    }

    @Override
    public void verschluss(G36 g) {
        g.setState(new Gespannt());
    }

    @Override
    public void magazinEinführen(G36 g) {
        g.setState(new Fertigeladen());
    }

    @Override
    public void magazinEntnehmen(G36 g) {
        System.out.println("Da ist kein Magazin mehr");
    }

    @Override
    public void abkrümmen(G36 g) {
        System.out.println("KAAAAABuuuuummmmm!!!!!");
        g.setState(new Gespannt());
    }
}
