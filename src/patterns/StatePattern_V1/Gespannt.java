package patterns.StatePattern_V1;

public class Gespannt implements State{
    @Override
    public void next(G36 g) {
        g.setState(new Entladen());
    }

    @Override
    public void prev(G36 g) {
        g.setState(new Entladen());
    }

    @Override
    public void verschluss(G36 g) {
    }

    @Override
    public void magazinEinführen(G36 g) {
        g.setState(new Teilgeladen());
    }

    @Override
    public void magazinEntnehmen(G36 g) {
        System.out.println("Da ist kein Magazin");
    }

    @Override
    public void abkrümmen(G36 g) {
        System.out.println("*Klick");
        g.setState(new Entladen());
    }
}
