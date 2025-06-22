package patterns.StatePattern;

public class Teilgeladen implements State{
    @Override
    public void next(G36 g) {
        System.out.println("Verschluss... -> Fertig laden");
        g.setState(new Fertigeladen());
    }

    @Override
    public void prev(G36 g) {
        g.setState(new Entladen());
    }

    @Override
    public void verschluss(G36 g) {
        g.setState(new Fertigeladen());
    }

    @Override
    public void magazinEinführen(G36 g) {
        System.out.println("Da ist schon Magazin drin");
    }

    @Override
    public void magazinEntnehmen(G36 g) {
        g.setState(new Entladen());
    }

    @Override
    public void abkrümmen(G36 g) {
    }
}
