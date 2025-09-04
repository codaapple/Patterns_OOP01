package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;
import oop.ch06.calc.UnaryOp;

class NoOp extends State<Upper> {
    NoOp(Upper parent) {
        super(parent, "no_op");
    }

    @Override
    void unOp(UnaryOp op) {
        final Calculator c = getCalculator();
        c.setValue(op.eval(c.getValue()));
    }

    @Override
    void binOp(BinaryOp op) {
        final Calculator c = getCalculator();
        c.setLastOp(op);
        c.setOpnd1(c.getValue());
        parent.gotoState(new BinOp(parent));
    }
}
