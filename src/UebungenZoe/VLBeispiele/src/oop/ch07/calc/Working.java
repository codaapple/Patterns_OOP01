package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;
import oop.ch06.calc.UnaryOp;

class Working extends State<Automaton> {
    private final Upper upper;
    private final Lower lower;

    Working(Automaton parent) {
        super(parent, "working");
        upper = new Upper(this);
        lower = new Lower(this);
    }

    @Override
    void entry() {
        getCalculator().setValue(0.0);
        upper.entry();
        lower.entry();
    }

    @Override
    void digit(int d) {
        upper.digit(d);
        lower.digit(d);
    }

    @Override
    void dot() {
        upper.dot();
        lower.dot();
    }

    @Override
    void unOp(UnaryOp op) {
        upper.unOp(op);
        lower.unOp(op);
    }

    @Override
    void binOp(BinaryOp op) {
        upper.binOp(op);
        lower.binOp(op);
    }

    @Override
    void eval() {
        upper.eval();
        lower.eval();
    }

    @Override
    void clear() {
        upper.clear();
        lower.clear();
    }

    @Override
    void allClear() {
        parent.gotoState(new Working(parent));
    }

    @Override
    void error() {
        getCalculator().setValue(Double.NaN);
        parent.gotoState(new Error(parent));
    }
}
