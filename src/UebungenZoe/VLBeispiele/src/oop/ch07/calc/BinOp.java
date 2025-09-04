package oop.ch07.calc;

import oop.ch06.calc.UnaryOp;

class BinOp extends StateMachine<BinOp, Upper> {
    BinOp(Upper parent) {
        super(parent, "bin_op");
    }

    @Override
    State<BinOp> initialState() {
        return new HasFirst(this);
    }

    @Override
    void unOp(UnaryOp op) {
        final Calculator c = getCalculator();
        c.setValue(op.eval(c.getValue()));
        gotoState(new HasSecond(this));
    }

    @Override
    void eval() {
        final Calculator c = getCalculator();
        c.setValue(c.getLastOp().eval(c.getOpnd1(), c.getValue()));
        parent.gotoState(new NoOp(parent));
    }
}
