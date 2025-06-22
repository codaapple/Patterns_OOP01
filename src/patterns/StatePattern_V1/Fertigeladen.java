package patterns.StatePattern_V1;

public class Fertigeladen implements State{
    @Override
    public void next(G36 g) {
        System.out.println("Fertigeladen");
    }

    @Override
    public void prev(G36 g) {
    }

    @Override
    public void verschluss(G36 g) {
        System.out.println("Du hast soeben eine Patrone ins nichts geworfen");
    }

    @Override
    public void magazinEinführen(G36 g) {
        System.out.println("Du hast schon n Magazin drin");
    }

    @Override
    public void magazinEntnehmen(G36 g) {
        g.setState(new PatroneDrin());
    }

    @Override
    public void abkrümmen(G36 g) {
        System.out.println("KAAAAABuuuuummmmm!!!!!");
    }
}
