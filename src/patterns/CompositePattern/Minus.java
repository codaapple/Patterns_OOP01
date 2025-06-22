package patterns.CompositePattern;

public class Minus extends BinExpr {
    public Minus(Expr op1, Expr op2) {
        super(op1, '-', op2);
    }
    @Override
    public int eval() {
        return op1.eval() - op2.eval();
    }
}
