package patterns.CompositePattern;

public class Const implements Expr{
    public final int value;
    public Const(int value) {
        this.value = value;
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
