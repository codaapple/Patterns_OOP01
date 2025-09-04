package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;
import oop.ch06.calc.UnaryOp;

class Lower extends StateMachine<Lower, Working> {
    Lower(Working parent) {
        super(parent, "lower");
    }

    @Override
    Unchanged initialState() {
        return new Unchanged(this);
    }

    @Override
    void unOp(UnaryOp op) {
        gotoState(new Unchanged(this));
    }

    @Override
    void binOp(BinaryOp op) {
        gotoState(new Unchanged(this));
    }

    @Override
    void eval() {
        gotoState(new Unchanged(this));
    }

    @Override
    void clear() {
        getCalculator().setValue(0.0);
        gotoState(new Unchanged(this));
    }
}
