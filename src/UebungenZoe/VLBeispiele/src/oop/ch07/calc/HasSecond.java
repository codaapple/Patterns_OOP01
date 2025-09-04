package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;

class HasSecond extends State<BinOp> {
    HasSecond(BinOp parent) {
        super(parent, "has_second");
    }

    @Override
    void binOp(BinaryOp op) {
        final Calculator c = getCalculator();
        c.setValue(c.getLastOp().eval(c.getOpnd1(), c.getValue()));
        c.setOpnd1(c.getValue());
        c.setLastOp(op);
        parent.gotoState(new HasFirst(parent));
    }

    @Override
    void clear() {
        parent.gotoState(new HasFirst(parent));
    }
}
