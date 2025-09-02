package patterns.CompositePatternZoe;

public class Const implements Expr {
    public final int value;
    public Const(int v) {
        this.value = v;
    }

    @Override
    public int eval() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
