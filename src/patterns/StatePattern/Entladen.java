package patterns.StatePattern;

public class Entladen implements State{

    @Override
    public void next(G36 g) {
        System.out.println("Magazin einführen");
        g.setState(new Teilgeladen());
    }

    @Override
    public void prev(G36 g) {
    }

    @Override
    public void verschluss(G36 g) {
        g.setState(new Gespannt());
    }

    @Override
    public void magazinEinführen(G36 g) {
        g.setState(new Teilgeladen());
    }

    @Override
    public void magazinEntnehmen(G36 g) {
        System.out.println("Da ist noch kein Magazin drin");
    }

    @Override
    public void abkrümmen(G36 g) {
    }
}
