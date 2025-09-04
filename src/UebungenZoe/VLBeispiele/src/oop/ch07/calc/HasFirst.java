package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;

class HasFirst extends State<BinOp> {
    HasFirst(BinOp parent) {
        super(parent, "has_first");
    }

    @Override
    void digit(int d) {
        parent.gotoState(new HasSecond(parent));
    }

    @Override
    void dot() {
        parent.gotoState(new HasSecond(parent));
    }

    @Override
    void binOp(BinaryOp op) {
        getCalculator().setLastOp(op);
    }
}
