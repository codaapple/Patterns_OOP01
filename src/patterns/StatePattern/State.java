package patterns.StatePattern;

public interface State {
    void next(G36 g);
    void prev(G36 g);
    void verschluss(G36 g);
    void magazinEinführen(G36 g);
    void magazinEntnehmen(G36 g);
    void abkrümmen(G36 g);
}
