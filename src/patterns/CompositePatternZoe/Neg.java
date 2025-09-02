package patterns.CompositePatternZoe;

public class Neg implements Expr{
    public final Expr op;
    public Neg(Expr op) {
        this.op = op;
    }

    @Override
    public int eval() {
        return -op.eval();
    }

    @Override
    public String toString() {
        return "(-" + op + ")";
    }
}
