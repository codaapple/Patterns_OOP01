package patterns.CompositePatternZoe;

public class Mult extends BinExpr {
    public Mult(Expr op1, Expr op2) {
        super(op1, '*', op2);
    }

    @Override
    public int eval() {
        return op1.eval() * op2.eval();
    }
}
